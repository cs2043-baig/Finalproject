import java.util.*;
public class Student {
    private String name;
    private String email;
    private int ID;
    private Course[] courses;

    // construct a new student with given fields
public Student(String name, String email, int ID, Course[] courses){
    this.name = name;
    this.email = email;
    this.ID = ID;
    courses = new Course[6];
    }
    
    
     public Course[] getCourses(Course[] c){
        return c;
    }

    public void drop(){
        //if deadline crossed cant drop
        //remove that specific course from array
    }
    
    public void add(){
        //if deadline crossed cant add
        //calling catalog();
        //whatever the student select add to course Array
    }
}
