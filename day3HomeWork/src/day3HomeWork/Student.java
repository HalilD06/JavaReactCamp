package day3HomeWork;

public class Student extends User {
	
	String studentCourse;
	
	
	public Student (int id,String firstName,String lastName,String password) {
		super (id,firstName,lastName,password);
	}


	public String getStudentCourse() {
		return studentCourse;
	}


	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

}
