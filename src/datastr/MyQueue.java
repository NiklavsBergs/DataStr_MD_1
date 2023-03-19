package datastr;

public class MyQueue<T> {
	private MyNodeQ frontNode;
	private MyNodeQ rearNode;
	private int length;
	
	public MyQueue() {
		frontNode = null;
		rearNode = null;
		length = 0;
	}
	
	public boolean isFull() {
		try {
			MyNodeQ<T> newNode = new MyNodeQ<T>(null);
		}
		catch (OutOfMemoryError e){
			return true;
		}
	
		return false;
	}
	
	public boolean isEmpty() {
		return(frontNode == null);
	}

	public int getLength() {
		return length;
	}
	
	public void enqueue(T newElement) {
		if(length == 0) {
			MyNodeQ<T> newNode = new MyNodeQ<T>(newElement);
			frontNode = newNode;
			rearNode = newNode;
			length++;
		}
		else if (length == 1){
			MyNodeQ<T> newNode = new MyNodeQ<T>(newElement);
			frontNode.setNext(newNode);
			rearNode = newNode;
			length++;
		}
		else {
			MyNodeQ<T> newNode = new MyNodeQ<T>(newElement);
			rearNode.setNext(newNode);
			rearNode = newNode;
			length++;
		}
	}
	
	public void dequeue() throws Exception {
		if(length == 0) {
			throw (new Exception ("Queue already empty"));
		}
		else {
			frontNode = (MyNodeQ) frontNode.getNext();
			length--;
		}
	}
	
	public void print() throws Exception {
		if(length == 0) {
			throw (new Exception ("Queue is empty"));
		}
		else {
			MyNodeQ<T> tempNode = frontNode;
			for(int i = 0; i < length; i++) {
				System.out.print(tempNode + " ");
				tempNode = (MyNodeQ) tempNode.getNext();
			}
			System.out.println();
		}
		
	}
	
	public void makeEmpty() throws Exception {
		if(length ==0) {
			throw (new Exception ("Queue is already empty"));
		}
		else {
			frontNode = null;
			rearNode = null;
			length = 0;
		}
	}
	
	
}
