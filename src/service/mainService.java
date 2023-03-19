package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import datastr.Faculty;
import datastr.MyStack;
import datastr.Student;

public class mainService {

	public static void main(String[] args) {
		try {
			MyStack<Number> numberStack = new MyStack<>();
			MyStack<Student> studentStack = new MyStack<>();
			MyStack<String> emptyStack = new MyStack<>();
			
			//Number
			System.out.println("------Number------");
			System.out.println("Push:");
			numberStack.push(1);
			numberStack.push(2);
			numberStack.push(3);
			numberStack.push(4);
			numberStack.push(5);
			numberStack.push(6);
			numberStack.print();
			System.out.println();
			System.out.println();
			
			System.out.println("Pop:");
			numberStack.pop();
			numberStack.print();
			System.out.println();
			numberStack.pop();
			numberStack.print();
			System.out.println();
			System.out.println();
			
			System.out.println("Top:");
			System.out.println(numberStack.top());
			System.out.println();
			
			System.out.println("IsEmpty:");
			System.out.println("numberStack is empty: " + numberStack.isEmpty());
			System.out.println("emptyStack is empty: " + emptyStack.isEmpty());
			System.out.println();
			
			//Student
			System.out.println("------STUDENT------");
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
			System.out.println();
			System.out.println();
			
			//Syntax check
			System.out.println("------Syntax check------");
			System.out.println();
			
			checkSyntax("resources\\Student.java");
			System.out.println();
			checkSyntax("resources\\UserController.java");
			System.out.println();
			checkSyntax("resources\\UserServiceImplTest.java");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void checkSyntax(String fails) throws Exception {
		File f = new File(fails);
		FileReader fr = new FileReader (f);
		BufferedReader br = new BufferedReader(fr);
		
		MyStack<Number> characterStack = new MyStack<>();
		
		int charValue = 0;
		int lineCounter = 1;
		
		System.out.println("Checking syntax on " + fails);
		
		while ((charValue = br.read()) != -1) {
			
			if (charValue == 40 || charValue == 123) {
			
				//Checks if {} is not in ()
				if(characterStack.getLength() !=0) {
					if(charValue == 123 && characterStack.top().intValue() == 40) {
						System.out.println("Syntax error at or before line " + lineCounter);
						break;
					}
				}
				characterStack.push(charValue);
			}
			else if (charValue == 41 || charValue == 125) {
				if(characterStack.isEmpty()) {
					System.out.println("Syntax error at or before line " + lineCounter);
					break;
				}
				else if(charValue == 41 && characterStack.top().intValue() == 40) {
					characterStack.pop();
				}
				else if(charValue == 125 && characterStack.top().intValue() == 123) {
					characterStack.pop();
				}
				else {
					System.out.println("Syntax error at or before line " + lineCounter);
					break;
				}
			}
			else if (charValue == 10) {
				lineCounter++;
			}
		}
	}

}
