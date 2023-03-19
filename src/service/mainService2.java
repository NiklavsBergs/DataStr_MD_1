//MyQueue testing
//Queue goes from left(front) to right(rear) in console
package service;

import datastr.MyQueue;

public class mainService2 {

	public static void main(String[] args) {
		try {
			
			MyQueue<Number> numberQueue = new MyQueue<>();
			
			numberQueue.enqueue(1);
			numberQueue.enqueue(2);
			numberQueue.enqueue(3);
			numberQueue.print();
			System.out.println();
			System.out.println();
			
			numberQueue.dequeue();
			numberQueue.print();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
