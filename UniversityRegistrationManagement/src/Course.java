import java.util.*;

public class Course {
    private String name;
    private String courseID;
    private String professor;
    private String preReq;
    private int numStudents; // i think base on : "No course offering will have more than 10 students of fewer than 3 students."  we need to keep track of this number
    
    public Course(String name, String courseID, String professor, String preReq, int numStudents){
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

    public String toString(){
      return "Course name: "+name + ", " + courseID + "\nThe professor is: "+ professor +"\nPrerequisite: "+preReq+"\nNumber of Students: "+numStudents;
   }
    
    
    // "A course offering fewer than 3 students will be cancelled" : I think we need a method to keep track of this, like remove the course from the course list
}
