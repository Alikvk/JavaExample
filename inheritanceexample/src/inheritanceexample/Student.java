package inheritanceexample;

public class Student extends User {
	private int studentNo;
	private int score;



	public Student(int id, String firstName, String lastName, String userName, String password, int studentNo,
			int score) {
		super(id, firstName, lastName, userName, password);
		this.studentNo = studentNo;
		this.score = score;
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
