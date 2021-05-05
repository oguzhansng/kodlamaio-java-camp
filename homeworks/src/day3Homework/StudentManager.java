package day3Homework;

public class StudentManager {
	
	public void addStudent(Student student) {
		System.out.println("Öğrenci Eklendi "+student.getFirstName()+student.getLastName());
	}
	
	public void updateStudent (Student student) {
		System.out.println("Öğrenci Güncellendi "+student.getFirstName()+student.getLastName());
	}
	
	public void deleteStudent (Student student) {
		System.out.println("Öğrenci Silindi "+student.getFirstName()+student.getLastName());
	}
	
	


}
