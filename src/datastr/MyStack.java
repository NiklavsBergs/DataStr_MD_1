package datastr;

public class MyStack<T> {
	private MyNodeS topNode;
	private int length;
	
	public MyStack(){
		topNode = null;
		length = 0;
	}
	
	//public boolean isFull() {
		
	//}
	
	public boolean isEmpty() {
		if(length == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getElementCount(){
		return length;
	}
	
	public void push(T newElement) {
		if(length == 0) {
			MyNodeS<T> newNode = new MyNodeS<T>(newElement);
			topNode = newNode;
			length++;
		}
		else {
			MyNodeS<T> newNode = new MyNodeS<T>(newElement);
			topNode.setPrevious(newNode);
			newNode.setNext(topNode);
			topNode = newNode;
			length++;
		}
	}
	
	public void pop() throws Exception {
		if(length == 0) {
			throw (new Exception ("Stack already empty"));
		}
		else {
			topNode = topNode.getNext();
			topNode.getPrevious().setPrevious(null);
			length--;
		}
	}
	
	public T top() {
		return (T) topNode.getElement();
	}
	
	public void print() throws Exception {
		if(length == 0) {
			throw (new Exception ("Stack is empty"));
		}
		else {
			MyNodeS<T> tempNode = topNode;
			for(int i = 0; i < length; i++) {
				System.out.print(tempNode + " ");
				tempNode = tempNode.getNext();
			}
		}
		
	}
	
	public void makeEmpty() throws Exception {
		if(length ==0) {
			throw (new Exception ("Stack is already empty"));
		}
		else {
			topNode = null;
			length = 0;
		}
	}
}
