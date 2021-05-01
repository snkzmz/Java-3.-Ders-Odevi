package kodlamaio;

public class Instructor extends User {
	String branch;
	String givenCourses;
	
	public Instructor(String nickname, String name, String email, String password) {
		super(nickname, name, email, password);
		
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}
}
