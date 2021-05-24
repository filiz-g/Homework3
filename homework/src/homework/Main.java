package homework;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setUserId(123);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("engin@engin123.com");
		instructor.setCertificate("Java");
		
		Student student =new Student();
		student.setId(2);
		student.setUserId(987);
		student.setFirstName("Filiz");
		student.setLastName("Gül");
		student.setUniversityName("İstanbul Üniversitesi");
		
		UserManager userManager=new UserManager();
		userManager.add(student);
		userManager.add(instructor);
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		
		
		
		
		
		
		
	}

}
