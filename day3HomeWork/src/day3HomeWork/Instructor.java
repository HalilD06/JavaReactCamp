package day3HomeWork;

public class Instructor extends User{
	
	String instructorCourse;

	public Instructor(int id, String firtName, String lastName, String password, String instructorCourse) {
		super(id, firtName, lastName, password);
		this.instructorCourse = instructorCourse;
	}

	public String getInstructorCourse() {
		return instructorCourse;
	}

	public void setInstructorCourse(String instructorCourse) {
		this.instructorCourse = instructorCourse;
	}
		
}
