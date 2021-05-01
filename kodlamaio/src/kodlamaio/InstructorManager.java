package kodlamaio;

public class InstructorManager extends UserManager {
	
	@Override
	public void add(User user) {
		super.add(user);
		System.out.println("Eðitmen baþarýyla eklendi: " + user.getName());
	}
	
	public void addBranch(Instructor instructor, String branch) {
		instructor.setBranch(branch);
		System.out.println(instructor.getName() + ", Eðitmenin branþý tanýmlandý: " + instructor.getBranch());
	}
	
	public void addGivenCourse(Instructor instructor, String course) {
		instructor.setGivenCourses(course);
		System.out.println(instructor.getName() + ", Eðitmene ders eklendi: " + instructor.getGivenCourses());
		
	}
}