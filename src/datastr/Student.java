package datastr;

public class Student{

	private long id;
	private String name;
	private String surname;
	private Faculty faculty;
	private String personCode;
	
	private static long idCounter = 0;
	
	public Student() {
		setId();
		setName("Unknown");
		setSurname("Unknown");
		setFaculty(Faculty.other);
		setPersonCode("000000-00000");
	}
	
	public Student(String name, String surname, Faculty faculty, String personCode) {
		setId();
		setName(name);
		setSurname(surname);
		setFaculty(faculty);
		setPersonCode(personCode);
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

	public String getPersonCode() {
		return personCode;
	}

	public void setPersonCode(String personCode) {
		if(personCode!=null && personCode.matches("[0-9]{6}[-][0-9]{5}")) {
			this.personCode = personCode;
		}
		else {
			this.personCode = "000000-00000";
		}
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		if(faculty!=null) {
			this.faculty = faculty;
		}
		else {
			faculty = Faculty.other;
		}
		
	}
	
	public String toString() {
		return "" + id + ": " + getName() + " " + getSurname() + ", " + personCode + ", " + faculty;
	}
	
	
	
}