package datastr;

public class MyDeque<T> {
	private MyNodeD frontNode;
	private MyNodeD rearNode;
	private int length;
	
	public MyDeque() {
		frontNode = null;
		rearNode = null;
		length = 0;
	}
	
	public boolean isFull() {
		try {
			MyNodeD<T> newNode = new MyNodeD<T>(null);
		}
		catch (OutOfMemoryError e){
			return true;
		}
	
		return false;
	}
	
	public boolean isEmpty() {
		return(length == 0);
	}

	public int getLength() {
		return length;
	}
	
	public void enqueueAtFront(T newElement) {
		if(length == 0) {
			MyNodeD<T> newNode = new MyNodeD<T>(newElement);
			frontNode = newNode;
			rearNode = newNode;
			length++;
		}
		else {
			MyNodeD<T> newNode = new MyNodeD<T>(newElement);
			newNode.setPrev(frontNode);
			frontNode.setNext(newNode);
			frontNode = newNode;
			length++;
		}
	}
	
	public void enqueueAtEnd(T newElement) {
		if(length == 0) {
			MyNodeD<T> newNode = new MyNodeD<T>(newElement);
			frontNode = newNode;
			rearNode = newNode;
			length++;
		}
		else{
			MyNodeD<T> newNode = new MyNodeD<T>(newElement);
			rearNode.setPrev(newNode);
			newNode.setNext(rearNode);
			rearNode = newNode;
			length++;
		}
	}
	
	public void dequeueFromFront() throws Exception {
		if(length == 0) {
			throw (new Exception ("Queue already empty"));
		}
		else {
			frontNode = frontNode.getPrev();
			frontNode.setNext(null);
			length--;
		}
	}
	
	public void dequeueFromEnd() throws Exception {
		if(length == 0) {
			throw (new Exception ("Queue already empty"));
		}
		else {
			rearNode = (MyNodeD) rearNode.getNext();
			rearNode.setPrev(null);
			length--;
		}
	}
	
	public void print() throws Exception {
		if(length == 0) {
			throw (new Exception ("Queue is empty"));
		}
		else {
			MyNodeD<T> tempNode = frontNode;
			for(int i = 0; i < length; i++) {
				System.out.print(tempNode + " ");
				tempNode = tempNode.getPrev();
			}
			System.out.println();
		}
		
	}
	
	public void makeEmpty() throws Exception {
		if(length == 0) {
			throw (new Exception ("Queue is already empty"));
		}
		else {
			frontNode = null;
			rearNode = null;
			length = 0;
		}
	}
	
	
}
