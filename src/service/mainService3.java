//MyDeque testing
//Deque goes from left(front) to right(rear) in console
package service;

import datastr.MyDeque;
import datastr.Student;

public class mainService3 {

	public static void main(String[] args) {
		try {
			MyDeque<Integer> numberDeque = new MyDeque<>();
			MyDeque<Student> studentDeque = new MyDeque<>();
			
			System.out.println("MyDeque");
			System.out.println();
			
			//Number
			System.out.println("------Number------");
			System.out.println("Enqueue:");
		
			System.out.println("Enqueue at front:");
			numberDeque.enqueueAtFront(1);
			numberDeque.print();
			System.out.println("Enqueue at front:");
			numberDeque.enqueueAtFront(2);
			numberDeque.print();
			System.out.println("Enqueue at front:");
			numberDeque.enqueueAtFront(3);
			numberDeque.print();
			System.out.println("Enqueue at end:");
			numberDeque.enqueueAtEnd(4);
			numberDeque.print();
			System.out.println();
			
			System.out.println("Dequeue:");
			System.out.println("Dequeue from front:");
			numberDeque.dequeueFromFront();
			numberDeque.print();
			System.out.println("Dequeue from end:");
			numberDeque.dequeueFromEnd();
			numberDeque.print();
			
			//Student
			System.out.println("------STUDENT------");
			System.out.println("Enqueue:");
			
			System.out.println("Enqueue at front:");
			studentDeque.enqueueAtFront(new Student());
			studentDeque.print();
			System.out.println("Enqueue at front:");
			studentDeque.enqueueAtFront(new Student("Janis", "Ozolins"));
			studentDeque.print();
			System.out.println("Enqueue at end:");
			studentDeque.enqueueAtEnd(new Student("Olafs", "Lielais"));
			studentDeque.print();
			System.out.println();
			
			System.out.println("Dequeue:");
			System.out.println("Dequeue from front:");
			studentDeque.dequeueFromFront();
			studentDeque.print();
			System.out.println("Dequeue from end:");
			studentDeque.dequeueFromEnd();
			studentDeque.print();
			System.out.println();
			System.out.println();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}