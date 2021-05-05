package inheritanceexample;

public class InstructorManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() +" Eðitmen Eklendi");
	}
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() +" Eðitmen Silindi.");
	}
}
