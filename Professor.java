public class Professor extends User{
    private String name;
    private String email;
    private int ID;
    private Course[] courses;
    String username;
    String password;

    // construct a new student with given fields
    public Professor(String username, String password, String name, String email, int ID, Course[] courses){
        super(username, password);
        this.name = name;
        this.email = email;
        this.ID = ID;
        courses = new Course[6];
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }
    
    public Course[] getCourses(Course[] c){
        return c;
    }
}
