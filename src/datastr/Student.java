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
	
	private void setId() {
		id = idCounter;
		idCounter++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name!=null && name.matches("[A-ZĒŪĪĻĶĢŠĀČŅŽ]{1}[a-zēūīļķģšāčņž]+[ ]?([A-ZĒŪĪĻĶĢŠĀČŅŽ]{1}[a-zēūīļķģšāčņž]+)?")) {
			this.name = name;
		}
		else {
			this.name = "Unknown";
		}
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		if(surname!=null && surname.matches("[A-ZĒŪĪĻĶĢŠĀČŅŽ]{1}[a-zēūīļķģšāčņž]+[-]?([A-ZĒŪĪĻĶĢŠĀČŅŽ]{1}[a-zēūīļķģšāčņž]+)?")) {
			this.surname = surname;
		}
		else {
			this.surname = "Unknown";
		}
	}

	
	public String toString() {
		return "" + id + ": " + getName() + " " + getSurname();
	}
	
	
	
}