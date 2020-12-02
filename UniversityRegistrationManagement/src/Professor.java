import java.util.*;

public class Professor {
	private String name;
	private String email;
	private int id;
	private Course[] courses;
	Scanner scan = new Scanner(System.in);

	// construct a new student with given fields
	public Professor(String name, String email, int id){
    this.name = name;
    this.email = email;
    this.id = id;
    }
}
