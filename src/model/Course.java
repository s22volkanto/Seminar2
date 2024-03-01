package model;

public class Course {
	//1. variables
	private long cID;
	private String title;
	private Integer creditPoints;
	private Professor professor;
	
	private static long counter = 200;
	//2. set and get
	public long getcID() {
		return cID;
	}
	public void setcID() {
		this.cID = counter;
		counter++;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if(title != null  && title.matches("[A-Za-z 0-9]{4,40}"))
			this.title = title;
		else
			this.title = "Undefinied";
	}
	public int getCreditPoint() {
		return creditPoints;
	}
	public void setCreditPoint(Integer creditPoints) {
		if(creditPoints > 0 && creditPoints <=20)
			this.creditPoints = creditPoints;
		else
			this.creditPoints = 2;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		if(professor != null)
			this.professor = professor;
		else
			this.professor = new Professor();
	}
		
	
	//3. constructors
	public Course() {
		setcID();
		setTitle("Math Analysis");
		setCreditPoint(15);
		setProfessor(professor);
	}
	
	public Course(String title, Integer creditPoints, Professor professor) {
		setcID();
		setTitle(title);
		setCreditPoint(creditPoints);
		setProfessor(professor);
	}
	

	//4. toString
	@Override
	public String toString()
	{
		return cID + ": " + title + " (" + creditPoints + "CP)" + professor.getName().charAt(0) + ". " + professor.getSurname();
	}
	//5. other functions

}