import java.util.*;
public class Student {
    private String name;
    private String email;
    private int ID;
    private Course[] courses;
Scaner scan = new Scanner(System.in);
    // construct a new student with given fields
public Student(String name, String email, int ID, Course[] courses){
    this.name = name;
    this.email = email;
    this.ID = ID;
    this.course = course;
    }
    System.out.println("Do you want to print the courselist? Yes/No ");
     String a = scan.next();
    if(a.equals("Yes"))
    {
        for (int i = 0; i<course.length; i++)
        {
             return System.out.println(course[i]);
        }
    }
    System.out.println("Your semester fees is: $" + c.length*2500);
    System.out.println("Do you want to print the Schedule: Yes/No ");
    String b = scan.next();
    if(b.equals("Yes"))
    {
    File myObj = new File("Schedule.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine())
      {
        String data = myReader.nextLine();
        System.out.println(data);
      }
     myReader.close();
    }
    public void drop()
    {
        System.out.println("Deadline of droping a course is")
            if 
        //remove that specific course from array
    }
    
    public void add(){
        //if deadline crossed cant add
        //calling catalog();
        //whatever the student select add to course Array
    }
}
