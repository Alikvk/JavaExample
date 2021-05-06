package inheritanceexample;

public class Student extends User {

	private int userId;
	private String firstName;
	private String lastName;
	private int studentNo;
	private int score;

	public Student(int id, String userName, String password, int userId, String firstName, String lastName,
			int studentNo, int score) {
		super(id, userName, password);
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNo = studentNo;
		this.score = score;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
