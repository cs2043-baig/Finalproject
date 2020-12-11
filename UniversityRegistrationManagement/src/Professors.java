import java.util.*;
import java.io.*;
public class Professors implements Serializable{
    private String name;
    private String email;
    private String ID;
    //ArrayList <Course> coursesProf;
    String password;

    // construct a new student with given fields
    public Professors(String ID, String password, String name, String email)
   {
        this.password=password;
        this.name = name;
        this.email = email;
        this.ID = ID;
        //this.coursesProf=coursesProf;
    }

        public String getID()
 	{
		return ID;
	}

	public String getPassword()
	{
	        return password;
	}

	public String getName()
	{
	        return name;
	}

	public String getemail()
	{
	        return email;
	}
        
	public void getList(String X, ArrayList<Course> a)
	 {
	    for(int i = 0; i<a.size(); i++)
	      {
	        if(name.equals(a.get(i).getProfessor()))
		{
		   System.out.println(i+1 + "). " + a.get(i).toString());
		}
              }
	 }
	
}