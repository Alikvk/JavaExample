package inheritanceexample;

public class Course {
	private int id;
	private String name;
	private int lessonLong;

	public Course(int id, String name, int lessonLong) {
		super();
		this.id = id;
		this.name = name;
		this.lessonLong = lessonLong;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLessonLong() {
		return lessonLong;
	}

	public void setLessonLong(int lessonLong) {
		this.lessonLong = lessonLong;
	}

}
