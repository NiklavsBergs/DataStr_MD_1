//MyStack testing
package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import datastr.MyStack;
import datastr.Student;

public class mainService {

	public static void main(String[] args) {
		try {
			MyStack<Integer> numberStack = new MyStack<>();
			MyStack<Student> studentStack = new MyStack<>();
			MyStack<String> emptyStack = new MyStack<>();
			
			System.out.println("MyStack");
			System.out.println();
			
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
			studentStack.push(new Student("Janis", "Ozolins"));
			studentStack.push(new Student("Olafs", "Lielais"));
			studentStack.print();
			System.out.println();
			System.out.println();
			
			System.out.println("Pop:");
			studentStack.pop();
			studentStack.print();
			System.out.println();
			System.out.println();
			
			System.out.println("Top:");
			System.out.println(studentStack.top());
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
	
	public static void checkSyntax(String fileName) throws Exception {
		File f = new File(fileName);
		FileReader fr = new FileReader (f);
		BufferedReader br = new BufferedReader(fr);
		
		MyStack<Integer> characterStack = new MyStack<>();
		MyStack<Integer> lineNumStack = new MyStack<>();
		
		int charValue = 0;
		int lineCounter = 1;
		
		boolean stringCheck = false;
		boolean charCheck = false;
		boolean specCharCheck = false;
		boolean errorCheck = false;
		
		System.out.println("Checking syntax on " + fileName);
		
		while ((charValue = br.read()) != -1) {
			
			//String and Character detection " ", ' '
			if (stringCheck) {
				if (charValue == 92) {
					specCharCheck = true;
					continue;
				}
				else if ((specCharCheck) && (charValue == 34)) {
					specCharCheck = false;
					continue;
				}
				else if (charValue == 34) {
					stringCheck = false;
					continue;
				}
				else {
					continue;
				}
			}
			
			else if (charCheck) {
				if (charValue == 92) {
					specCharCheck = true;
					continue;
				}
				else if ((specCharCheck) && (charValue == 39)) {
					specCharCheck = false;
					continue;
				}
				else if (charValue == 39) {
					charCheck = false;
					continue;
				}
			}
			
			else if (charValue == 34) {
				stringCheck = true;
				continue;
			}
			
			else if (charValue == 39) {
				charCheck = true;
				continue;
			}
			
			//Bracket check (), {}, [], <>
			else if (charValue == 40 || charValue == 91 || charValue == 123 || charValue == 60) {
				characterStack.push(charValue);
				lineNumStack.push(lineCounter);
			}
			
			else if (charValue == 41 || charValue == 93 || charValue == 125 || charValue == 62) {
				if(characterStack.isEmpty()) {
					System.out.println("Syntax error at line " + lineCounter);
					errorCheck = true;
					break;
				}
				else if(charValue == 41 && characterStack.top().intValue() == 40) {
					characterStack.pop();
					lineNumStack.pop();
				}
				else if(charValue == 62 && characterStack.top().intValue() == 60) {
					characterStack.pop();
					lineNumStack.pop();
				}
				else if(charValue == 93 && characterStack.top().intValue() == 91) {
					characterStack.pop();
					lineNumStack.pop();
				}
				else if(charValue == 125 && characterStack.top().intValue() == 123) {
					characterStack.pop();
					lineNumStack.pop();
				}
				else {
					System.out.println("Syntax error: Brackets at line " + lineNumStack.top() + " and " + lineCounter + " don't match.");
					errorCheck = true;
					break;
				}
			}
			else if (charValue == 10) {
				lineCounter++;
			}
		}
		
		if (characterStack.isEmpty() && errorCheck == false) {
			System.out.println("No errors found! :)");
		}
		else if (errorCheck == false){
			System.out.println("Syntax error at line " + lineNumStack.top());
		}
		br.close();
	}

}
