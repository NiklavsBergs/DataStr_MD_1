//MyQueue testing
//Queue goes from left(front) to right(rear) in console
package service;

import java.util.concurrent.ThreadLocalRandom;

import datastr.MyQueue;
import datastr.Student;

public class mainService2 {

	public static void main(String[] args) {
		try {
			
			MyQueue<Integer> numberQueue = new MyQueue<>();
			MyQueue<Student> studentQueue = new MyQueue<>();
			MyQueue<String> emptyQueue = new MyQueue<>();
			
			System.out.println("MyQueue");
			System.out.println();
			
			//Number
			System.out.println("------Number------");
			System.out.println("Enqueue:");
			numberQueue.enqueue(1);
			numberQueue.print();
			numberQueue.enqueue(2);
			numberQueue.print();
			numberQueue.enqueue(3);
			numberQueue.print();
			System.out.println();
			
			System.out.println("Dequeue:");
			numberQueue.dequeue();
			numberQueue.print();
			numberQueue.dequeue();
			numberQueue.print();
			System.out.println();
			
			System.out.println("IsEmpty:");
			System.out.println("numberQueue is empty: " + numberQueue.isEmpty());
			System.out.println("emptyQueue is empty: " + emptyQueue.isEmpty());
			System.out.println();
			
			
			//Student
			System.out.println("------STUDENT------");
			System.out.println("Enqueue:");
			studentQueue.enqueue(new Student());
			studentQueue.print();
			studentQueue.enqueue(new Student("Janis", "Ozolins"));
			studentQueue.print();
			studentQueue.enqueue(new Student("Olafs", "Lielais"));
			studentQueue.print();
			System.out.println();
			
			System.out.println("Dequeue:");
			studentQueue.dequeue();
			studentQueue.print();
			System.out.println();
			System.out.println();
			
			System.out.println("------CALL CENTER------");
			callCenter();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	/* 
	 Call center simulation
	 Function randomly chooses to make a new incoming call, or to answer a call in the queue,
	 then chooses a random time between 1 and 2 seconds in between actions,
	 repeating the cycle 20 times, then answers the callers left in the queue if there are any.
	 */
	public static void callCenter() throws Exception {
		MyQueue<String> callerQueue = new MyQueue<>();
		
		int action = 0;
		int numberRand = 0;
		
		for(int i = 0; i < 20; i++) {
			action = ThreadLocalRandom.current().nextInt(1, 3);
			if (action == 1) {
				numberRand = ThreadLocalRandom.current().nextInt(1000000, 9999999);
				callerQueue.enqueue("2" + numberRand);
				System.out.println("Incoming Call:");
				callerQueue.print();
			}
			else if (action == 2) {
				if (callerQueue.isEmpty() != true) {
					callerQueue.dequeue();
					System.out.println("Call answered:");
					if (callerQueue.isEmpty() != true) {
						callerQueue.print();
					}
					else {
						System.out.println();
					}
				}
			}
			
			Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 2000));
		}
		
		while(callerQueue.isEmpty() != true) {
			callerQueue.dequeue();
			System.out.println("Call answered:");
			if (callerQueue.isEmpty() != true) {
				callerQueue.print();
			}
			Thread.sleep(1000);
		}
	}

}
