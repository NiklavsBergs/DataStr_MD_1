package datastr;

public class MyNodeD<T> extends MyNodeS<T> {
	private MyNodeD prev = null;

	public MyNodeD(T inputElement) {
		super(inputElement);
	}

	public MyNodeD getPrev() {
		return prev;
	}

	public void setPrev(MyNodeD prev) {
		this.prev = prev;
	}
	
	
}
