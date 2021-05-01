package kodlamaio;

public class StudentManager extends UserManager {
	
	@Override
	public void add(User user) {
		super.add(user);
		System.out.println("Öğrenci başarıyla sisteme eklendi: " + user.getName());
	}
	
	public void addTakenCourse(Student student, String course) {
		student.setTakenCourse(course);
		System.out.println(student.getName() + ", Öğrenciye ders tanımlandı: " + student.getTakenCourse());
	}
	
	public void addFinishedCourse(Student student, String course) {
		student.setFinishedCourse(course);
		System.out.println(student.getName() + ", Öğrenciye tamamlanmış ders eklendi: " + student.getFinishedCourse());
	}
}
