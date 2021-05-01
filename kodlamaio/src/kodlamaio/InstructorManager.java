package kodlamaio;

public class InstructorManager extends UserManager {
	
	@Override
	public void add(User user) {
		super.add(user);
		System.out.println("E�itmen ba�ar�yla eklendi: " + user.getName());
	}
	
	public void addBranch(Instructor instructor, String branch) {
		instructor.setBranch(branch);
		System.out.println(instructor.getName() + ", E�itmenin bran�� tan�mland�: " + instructor.getBranch());
	}
	
	public void addGivenCourse(Instructor instructor, String course) {
		instructor.setGivenCourses(course);
		System.out.println(instructor.getName() + ", E�itmene ders eklendi: " + instructor.getGivenCourses());
		
	}
}