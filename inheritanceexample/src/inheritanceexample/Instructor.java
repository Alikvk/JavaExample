package inheritanceexample;

public class Instructor extends User {


	private int instructorNo;
	private int salary;



	public Instructor(int id, String firstName, String lastName, String userName, String password, int instructorNo,
			int salary) {
		super(id, firstName, lastName, userName, password);
		this.instructorNo = instructorNo;
		this.salary = salary;
	}

	public int getInstructorNo() {
		return instructorNo;
	}

	public void setInstructorNo(int instructorNo) {
		this.instructorNo = instructorNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
