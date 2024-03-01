package sevice;

import model.Course;
import model.Degree;
import model.Professor;
import model.Student;

public class MainService {

	public static void main(String[] args) {
		Professor pr1 = new Professor();//John Big - default Professor
		System.out.println(pr1);
		Professor pr2 = new Professor("Karina", "Skirmane", Degree.mg);
		System.out.println(pr2);
		Professor pr3 = new Professor("Estere", "Vitola", Degree.mg);
		System.out.println(pr3);
		
		
		Student st1 = new Student();
		System.out.println(st1);
		Student st2 = new Student("Anton", "Volkov");
		System.out.println(st2);
		Student st3 = new Student("Igors", "Goncarovs");
		System.out.println(st3);
		
		Course cr1 = new Course();
		System.out.println(cr1);
		Course cr2 = new Course("JAVA", 4, pr2);
		System.out.println(cr2);
		Course cr3 = new Course("Data Sturcture", 6, pr3);
		System.out.println(cr3);

	}

}
