package inheritanceexample;

public class Main {

	public static void main(String[] args) {
		Instructor enginDemirog = new Instructor(1, "Engin", "Demirog", "engindemirog", "1234", 1, 20000);
		Instructor nukhetTuncbilek = new Instructor(1, "Nükhet", "Tunçbilek", "nukhetTuncbilek", "54353", 1, 30000);
		
		Student ali = new Student(1, "Ali", "Kavak", "alikavak", "12345", 1, 0);
		Student veli = new Student(2, "Veli", "Kaya", "velikaya", "21434", 1, 0);
		
		Course csharp = new Course(1,"Csharp",25);
		Course java = new Course(2,"Java",18);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(enginDemirog);
		instructorManager.add(nukhetTuncbilek);
		instructorManager.delete(enginDemirog);
		instructorManager.delete(nukhetTuncbilek);
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(csharp);
		courseManager.add(java);
		courseManager.delete(csharp);
		courseManager.delete(java);
		
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.enroll(ali, csharp.getName());
		studentManager.enroll(ali, java.getName());
		studentManager.enroll(veli, csharp.getName());
		studentManager.enroll(veli, java.getName());
		
		studentManager.delete(ali, csharp.getName());
		studentManager.delete(ali, java.getName());
		studentManager.delete(veli, csharp.getName());
		studentManager.delete(veli, java.getName());
		
	}

}
