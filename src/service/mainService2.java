//MyQueue testing
//Queue goes from left(front) to right(rear) in console
package service;

import datastr.Faculty;
import datastr.MyQueue;
import datastr.Student;

public class mainService2 {

	public static void main(String[] args) {
		try {
			
			MyQueue<Number> numberQueue = new MyQueue<>();
			MyQueue<Student> studentQueue = new MyQueue<>();
			
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
			System.out.println();
			
			System.out.println("Dequeue:");
			numberQueue.dequeue();
			numberQueue.print();
			numberQueue.dequeue();
			numberQueue.print();
			
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
			System.out.println();
			
			System.out.println("Dequeue:");
			studentQueue.dequeue();
			studentQueue.print();
			System.out.println();
			System.out.println();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
