package kodlamaio;

public class Student extends User {
	private String takenCourse;
	private String finishedCourse;
	
	public Student(String nickname, String name, String email, String password) {
		super(nickname, name, email, password);
	}

	public String getTakenCourse() {
		return takenCourse;
	}

	public void setTakenCourse(String takenCourse) {
		this.takenCourse = takenCourse;
	}

	public String getFinishedCourse() {
		return finishedCourse;
	}

	public void setFinishedCourse(String finishedCourse) {
		this.finishedCourse = finishedCourse;
	}


	
}
