//MyDeque testing
//Deque goes from left(front) to right(rear) in console
package service;

import java.util.Scanner;

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
			
			System.out.println("" + studentDeque.getFrontNode());
			browserHistory();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	
	//To exit browserHistory() function, when asked for a link don't enter anything and press enter

	public static void browserHistory() throws Exception {
		MyDeque<String> historyDeque = new MyDeque<>();
		String link = "";
		
		Scanner myObj = new Scanner(System.in);
		
	    System.out.println("Enter a link:");
	    link = myObj.nextLine();
	    
	    while(link != "") {
	    	
	    	if (link.equals("1")) {
	    		
	    		if (historyDeque.isEmpty()) {
	    			System.out.println("Browse History is empty");
	    			
	    			System.out.println("Enter a link:");
	    	    	link = myObj.nextLine();
	    	    	
	    			continue;
	    		}
	    		
	    		System.out.println("" + historyDeque.getFrontNode());
	    		historyDeque.dequeueFromFront();
	    		
	    	}
	    	
	    	else {
	    		
	    		if(link!=null && link.matches("^(http(s):\\/\\/.)[-a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%_\\+.~#?&//=]*)$")) {
	    			
	    			if(historyDeque.getLength() >= 10) {
	    				System.out.println("Removed last link");
		    			historyDeque.dequeueFromEnd();
		    		}
	    			
			    	historyDeque.enqueueAtFront(link);
	    		}
	    		
	    		else {
	    			System.out.println("Not a valid link");
	    		}
		    }
	    	
	    	System.out.println("Enter a link:");
	    	link = myObj.nextLine();
	    	
	    }
	    historyDeque.print();
	    myObj.close();
	}
}
