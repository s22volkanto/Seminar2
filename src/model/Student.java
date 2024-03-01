package model;

public class Student {
	//1. variables
	private long stID;
	private String name;
	private String surname;
	
	private static long counter = 100;
	//2. set and get
	public long getstID() {
		return stID;
	}
	public void setstID() {
		this.stID = counter;
		counter++;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name != null  && name.matches("[A-Z]{1}[a-z]{1,20}"))
			this.name = name;
		else
			this.name = "Undefinied";
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		if(surname != null && surname.matches("[A-Z]{1}[a-z]{1,20}"))
			this.surname = surname;
		else
			this.surname = "Undefinied";
	}
		
	
	//3. constructors
	public Student() {
		setstID();
		setName("Jim");
		setSurname("Small");
	}
	
	public Student(String name, String surname) {
		setstID();
		setName(name);
		setSurname(surname);
	}
	

	//4. toString
	@Override
	public String toString()
	{
		return stID + ": " + name + " " + surname;
	}
	//5. other functions

}