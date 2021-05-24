package homework;

public class StudentManager extends UserManager {
	
	@Override
	public void add(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " adlý öðrenci baþarýyla eklendi." );
	}
	
	

}
