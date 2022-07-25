package p2;

import java.util.ArrayList;

/* class contains some business operations on Student*/

public class StudentAction {
	private ArrayList<Student> studentsDB= new ArrayList<>();

	// store student information 
	public boolean doSaveStudent(Student student)
	{
		// code to store
		return studentsDB.add(student);
	}
	
	// fetch the students records
	public ArrayList<Student> getStudents(String course) {
		ArrayList<Student> results = new ArrayList<>();
		for (Student s: studentsDB) {
			if(s.getCourse().equals(course))  results.add(s);
		}
		return results;
	}

	public ArrayList<Student> getStudentsBasedOnScreeningScore(int range1, int range2) {
		ArrayList<Student> results = new ArrayList<>();
		for (Student s: studentsDB) {
			int screeningScore = s.getScreeningScore();
			if(screeningScore > range1 && screeningScore < range2) results.add(s);
		}
		return results;
	}
}
