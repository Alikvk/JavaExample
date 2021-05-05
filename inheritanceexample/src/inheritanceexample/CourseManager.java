package inheritanceexample;

public class CourseManager {
	public void add(Course course) {
		System.out.println(course.getName() + " Kurs Eklendi");
	}
	public void delete(Course course) {
		System.out.println(course.getName() + " Kurs Silindi");
	}
}
