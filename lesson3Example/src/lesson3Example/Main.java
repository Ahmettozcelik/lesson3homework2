package lesson3Example;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.name = "Engin";
		instructor.age = 35;
		instructor.from = "Ankara";
		instructor.lesson = "Java";
		
		Student student = new Student();
		student.name = "Ahmet";
		student.age = 25;
		student.from = "İstanbul";
		student.lessonPrice = 1500;
		
		User[] users = new User[] {instructor, student};
		
		for (User user : users) {
			System.out.println(user.name);
			System.out.println(user.age);
			System.out.println(user.from);
		}
		
		UserManager userManager = new UserManager();
		userManager.addMultiple(users);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		
		
		
		
		

	}

}
