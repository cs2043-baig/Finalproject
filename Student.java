import java.util.*;
public class Student {
    private String name;
    private String email;
    private int ID;
    private Course courses [] = new Course[6];

    // construct a new student with given fields
public Student(String name, String email, int ID, Course [] X) {
    this.name = name;
    this.email = email;
    this.ID = ID;
    this.X = X;
    }
    
    
     public getCourses(Course [] a)
    {
    }
    public drop()
    {
    if deadline crossed cant drop
    remove that specific course from array
    }
    
     public add()
    {
    if deadline crossed cant add
    calling catalog();
    whatever the student select add to course Array
    }
}
