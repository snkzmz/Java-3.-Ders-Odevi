package kodlamaio;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("snkzmz", "Ibrahim Sina Kizmaz", "sinakizmaz@gmail.com", "12345abc");
		
		Instructor instructor1 = new Instructor("gktn507", "Göktan Bayraktar", "goktan123123@hotmail.com", "abc123cba");
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.addTakenCourse(student1, "Java");
		studentManager.addFinishedCourse(student1, "C#");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.addGivenCourse(instructor1, "Java");
		instructorManager.addBranch(instructor1, "Back-End");	
	}
}
