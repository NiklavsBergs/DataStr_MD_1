package datastr;

public class Student{

	private long id;
	private String name;
	private String surname;
	
	private static long idCounter = 1;
	
	public Student() {
		setId();
		setName("Unknown");
		setSurname("Unknown");
	}
	
	public Student(String name, String surname) {
		setId();
		setName(name);
		setSurname(surname);
	}

	public long getId() {
		return id;
	}
	
	public void setId() {
		id = idCounter;
		idCounter++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	
	public String toString() {
		return "" + id + ": " + getName() + " " + getSurname();
	}
	
	
	
}