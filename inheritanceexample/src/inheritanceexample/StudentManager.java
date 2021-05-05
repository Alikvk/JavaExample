package inheritanceexample;

public class StudentManager {
	public void enroll(Student student,String courseName) {
		System.out.println("User " + student.getFirstName() + " " + student.getLastName()  +" enrolled the course: " + courseName);
	}
	public void delete(Student student,String courseName) {
		System.out.println("User " + student.getFirstName() + " " + student.getLastName()   +" deleted the course: " + courseName);
	}
}
