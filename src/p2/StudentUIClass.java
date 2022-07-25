package p2;

public class StudentUIClass {

	public static void main(String[] args) {

		Student s1 = new Student(101,"Mike","Java");
		Student s2 = new Student(102,"Jenny","Maths");
		Student s3 = new Student(103,"Alex","Java");

		StudentAction studentAction = new StudentAction();
		boolean status = studentAction.doSaveStudent(s1);
		status = studentAction.doSaveStudent(s2);
		status = studentAction.doSaveStudent(s3);
		System.out.println(studentAction.getStudents("Java"));
		
	}
}
