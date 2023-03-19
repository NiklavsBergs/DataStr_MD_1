package datastr;

public class MyNodeQ<T> extends MyNodeS<T>{
	
	private MyNodeQ previous = null;
	
	public MyNodeQ(T inputElement){
		super(inputElement);
	}

	public MyNodeQ getPrevious() {
		return previous;
	}

	public void setPrevious(MyNodeQ previous) {
		this.previous = previous;
	}
	
	
}
