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
	
	
	
	
}
