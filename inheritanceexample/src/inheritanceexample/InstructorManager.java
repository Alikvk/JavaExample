package inheritanceexample;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() +" E�itmen Eklendi");
	}
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() +" E�itmen Silindi.");
	}
}
