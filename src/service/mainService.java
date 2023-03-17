package service;

import datastr.MyStack;

public class mainService {

	public static void main(String[] args) {
		try {
			MyStack<String> steks = new MyStack<>();
			MyStack<String> steks2 = new MyStack<>();
			
			System.out.println("Push:");
			steks.push("1");
			steks.push("2");
			steks.push("3");
			steks.push("4");
			steks.push("5");
			steks.push("6");
			steks.print();
			System.out.println();
			System.out.println();
			
			System.out.println("Pop:");
			steks.pop();
			steks.print();
			steks.pop();
			steks.print();
			System.out.println();
			System.out.println();
			
			System.out.println("Top:");
			System.out.println(steks.top());
			System.out.println();
			
			System.out.println("IsEmpty:");
			System.out.println(steks.isEmpty());
			System.out.println(steks2.isEmpty());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
