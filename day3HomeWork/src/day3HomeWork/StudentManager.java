package day3HomeWork;

public class StudentManager {
	
	public void add (User user) {
		System.out.println(user.getFirtName()+user.getLastName()+" Named Student Added!");
	}
	
	public void delete (User user) {
		System.out.println(user.getFirtName()+user.getLastName()+" Named Student Deleted!!!");
	}

}
