package day2Homework;
public class Main {
	public static void main(String[] args) {
		
		System.out.println("Kodlama io");
		Course course1=new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)","Engin Demiroð","Sýfýrdan ileri seviyeye");
		Course course2=new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)","Engin Demiroð","Sýfýrdan ileri seviyeye");
		Course course3=new Course(3,"Programlamaya Giriþ Ýçin Temel Kurs","Engin Demiroð","Baþlangýç seviye");
		
		Category category1=new Category(1,"Programlama");
		Category category2=new Category(2,"Siber Güvenlik");
					
		Course[] courses ={course1,course2,course3};
		Category[] categories= {category1,category2};
		
		System.out.println("-----------------Kurslar--------------");
		
		
		for(Course course:courses) {
			System.out.println(course.courseName);
		}
		System.out.println("-----------------Kategoriler--------------");
		
		for(Category category:categories) {
			System.out.println(category.categoryName);
		}
		
		System.out.println("------------------------------------------");
		CourseManager courseManager =new CourseManager();
		courseManager.updateCourse(course2);
		courseManager.removeCourse(course3);		
	}	
}
