package day3Homework;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student();
		student1.setStudentId(1);
		student1.setFirstName("Oðuzhan");
		student1.setLastName("Þengün");
		student1.setEmail("test@gmail.com");
		student1.setPassword("12345");
		
		
		
		Instructor instructor1=new Instructor();
		InstructorManager instructorManager=new InstructorManager();
		instructor1.setInstructorId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroð");
		instructor1.setEmail("test123@gmail.com");
		instructor1.setPassword("123");
		instructorManager.addCourse("Nitelikli Yazýlýmcý Kampý");
		
		
		
		
		
		
		UserManager userManager=new UserManager();
		userManager.getInformation(student1);
		userManager.getInformation(instructor1);
	
	}

}
