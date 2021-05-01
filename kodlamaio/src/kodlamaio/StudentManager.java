package kodlamaio;

public class StudentManager extends UserManager {
	
	@Override
	public void add(User user) {
		super.add(user);
		System.out.println("��renci ba�ar�yla sisteme eklendi: " + user.getName());
	}
	
	public void addTakenCourse(Student student, String course) {
		student.setTakenCourse(course);
		System.out.println(student.getName() + ", ��renciye ders tan�mland�: " + student.getTakenCourse());
	}
	
	public void addFinishedCourse(Student student, String course) {
		student.setFinishedCourse(course);
		System.out.println(student.getName() + ", ��renciye tamamlanm�� ders eklendi: " + student.getFinishedCourse());
	}
}
