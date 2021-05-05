package day3HomeWork;

public class InstructorManager {
	
	public void add(User user) {
		System.out.println(user.getFirtName()+user.getLastName()+" Named Instructor Added!");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirtName()+user.getLastName()+" Named Instructor Deleted!!!");
	}
	
}
