package homework;

public class InstructorManager extends UserManager {
  
	@Override
	public void add(User user) {
		
		System.out.println(user.getFirstName()+ " "+ user.getLastName() + " adl� e�itmen ba�ar�yla eklendi");
	}
}
