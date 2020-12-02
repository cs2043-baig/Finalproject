import java.util.*;



public class Course {
	private String name;
	private String courseID;
	private String professor;
	private String preReq;
	private int numStudents;

	public Course(String name, String courseID, String professor, String preReq, int numStudents) {
		this.name = name;
		this.courseID = courseID;
		this.professor = professor;
		this.preReq = preReq;
		this.numStudents = numStudents;
	}

	String getName() {
		return name;
	}

	String getCourseID() {
		return courseID;
	}

	String getProfessor() {
		return professor;
	}

	String getPreReq() {
		return preReq;
	}

	int getNumberOfStudents() {
		return numStudents;
	}
	
}
