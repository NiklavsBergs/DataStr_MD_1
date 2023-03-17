package service;

import datastr.Faculty;
import datastr.MyStack;
import datastr.Student;

public class mainService {

	public static void main(String[] args) {
		try {
			MyStack<String> numberStack = new MyStack<>();
			MyStack<String> emptyStack = new MyStack<>();
			MyStack<Student> studentStack = new MyStack<>();
			
			//Number
			System.out.println("Push:");
			numberStack.push("1");
			numberStack.push("2");
			numberStack.push("3");
			numberStack.push("4");
			numberStack.push("5");
			numberStack.push("6");
			numberStack.print();
			System.out.println();
			System.out.println();
			
			System.out.println("Pop:");
			numberStack.pop();
			numberStack.print();
			numberStack.pop();
			numberStack.print();
			System.out.println();
			System.out.println();
			
			System.out.println("Top:");
			System.out.println(numberStack.top());
			System.out.println();
			
			System.out.println("IsEmpty:");
			System.out.println(numberStack.isEmpty());
			System.out.println(emptyStack.isEmpty());
			System.out.println();
			
			//Student
			System.out.println("STUDENT");
			System.out.println("Push:");
			studentStack.push(new Student());
			studentStack.push(new Student("Janis", "Ozolins", Faculty.ITF, "123456-65433"));
			studentStack.push(new Student("Olafs", "Zvaigzne", Faculty.TSF, "123457-65432"));
			studentStack.print();
			System.out.println();
			System.out.println();
			
			System.out.println("Pop:");
			studentStack.pop();
			studentStack.print();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public void checkSyntax() {
		
	}

}
