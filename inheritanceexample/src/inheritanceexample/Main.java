package inheritanceexample;

public class Main {

	public static void main(String[] args) {
		
		Instructor enginDemirog = new Instructor(1, "enginSag", "4536",1 , "Engin", "Sag",  1, 20000);
		Instructor nukhetTuncbilek = new Instructor(2, "nuketTunc", "54353",2,"Nüket", "Tunç", 2, 30000);
		
		Student ali = new Student(1, "Ali", "Kavak",3, "alikavak", "12345", 1, 10);
		Student veli = new Student(2, "Veli", "Kaya",4, "velikaya", "21434", 2 , 20);
		
		Course csharp = new Course(1,"Csharp",25);
		Course java = new Course(2,"Java",18);
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(csharp);
		courseManager.add(java);
		courseManager.delete(csharp);
		courseManager.delete(java);
		
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(enginDemirog);
		instructorManager.login(nukhetTuncbilek);
		instructorManager.add(enginDemirog);
		instructorManager.add(nukhetTuncbilek);
		instructorManager.delete(enginDemirog);
		instructorManager.delete(nukhetTuncbilek);
		instructorManager.logout(enginDemirog);
		instructorManager.logout(nukhetTuncbilek);
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(ali);
		studentManager.login(veli);
		studentManager.enroll(ali, csharp.getName());
		studentManager.enroll(ali, java.getName());
		studentManager.enroll(veli, csharp.getName());
		studentManager.enroll(veli, java.getName());
		studentManager.delete(ali, csharp.getName());
		studentManager.delete(ali, java.getName());
		studentManager.delete(veli, csharp.getName());
		studentManager.delete(veli, java.getName());
		studentManager.logout(ali);
		studentManager.logout(veli);
		
	}

}
