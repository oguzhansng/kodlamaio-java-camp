package day2Homework;

public class CourseManager {
	
	public void updateCourse(Course course) {
		System.out.println("Kurs Güncellendi :"+course.courseName);
	}
	
	public void removeCourse(Course course) {
		System.out.println("Kurs Silindi: "+course.courseName);
	}
	
}
