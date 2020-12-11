import java.util.*;
import java.io.*;
import java.util.Arrays;

//**Public class for student type**//
public class Student implements Serializable
    {
	//**Declaration of Variables**//
	private String name;
	private String email;
	private String id;
	private String password;
	
	ArrayList<Course> course = new ArrayList<>();
         transient Scanner scan =new Scanner(System.in);
	// construct a new student with given fields
	public Student(String name,String email,String id,String password,ArrayList<Course> course)
          {
                this.id=id;
		this.password=password;
		this.name = name;
		this.email = email;
		this.course=course;
	  }
	public String getID()
	{
		return id;
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


	public String getCourseSchedule(ArrayList<Course> b) 
	{
	  if (b.size() == 0)
	   {
            System.out.println("YOU ARE NOT ENROLLED IN ANY COURSE"); 
	   } 
	 else {
		 System.out.println("Courses: ");
	   	for (int i =0; i<b.size(); i++) 
 	   	  {
          	     System.out.println(i+1 + "). " + b.get(i).toString());
	   	  }
	     }
          return "All Courses";
	}
	
	public ArrayList<Course> getCourselist()
	{
	   return course;
	}
 	
	public void printBilling() {
		double Fees = course.size() * 2500;
		System.out.println("2500 perCourse");
		System.out.println("Your semester fees is: $" + Fees);
	}
	
	public String getCalender()
 	 {
  	try
         { 
                File myObj = new File("Schedule.txt");
      		  Scanner myReader = new Scanner(myObj);
      		  while (myReader.hasNextLine()) {
        	  String data = myReader.nextLine();
      		  System.out.println(data);
		}
             myReader.close();
		} catch (FileNotFoundException e) {
      System.out.println("An error occurred.");}
            return "For more Details contact ADMIN";
 	 }
		
	 public void drop(String X, ArrayList<Course> a, ArrayList<Course> e)
	 {
		boolean r=false;
		System.out.println("\nYou can not Drop course after deadline");
		 System.out.println("Which is 25th October\n");
	
		
		  
		  if (a.size()== 0 )
		   { 
                     System.out.println("YOU ARE NOT ENROLLED IN ANY COURSE");
		     r=true; 
                   } 
		  else 
		   {
		     for (int i=0; i<a.size(); i++)
		      {
		        if(X.equals(a.get(i).getCourseID()))
		          {
 	   	 	         a.remove(i);
				 r=true;
				 System.out.println("YOUR UPDATED COURSE-LIST IS: \n");
				 for (int y =0; y<a.size(); y++) 
 	   	 		  {
          	     		     System.out.println(y+1 + "). " + a.get(y).toString());
				     
	   			  }
				  System.out.println("\n");
				  System.out.println("Your update Semester fees is: " + a.size()*2500);	
				  System.out.println("\n");	
		         	 break; 
		           }
			
		
                       }
		     }
			if(r==false) 
			   {
				System.out.println("YOU CANNOT DROP THIS COURSE AS YOU ARE NOT ENROLLED or INVALID CODE\n");
										
			   }  
		
 		if(r==true)
		{
		  for (int i=0; i<e.size(); i++)
		      {
		        if(X.equals(e.get(i).getCourseID()))
		          {
			    e.get(i).setNumberOfStudents(1);
			  }
			if(e.get(i).getNumberOfStudents()<3)
			{
		  	   e.remove(i);	 
			}
		    }
		}
		

            }


	public void add(String Y,ArrayList<Course> c, ArrayList<Course> d)
	{
		boolean acc=false; 
  	 	boolean e = false;
		 for (int i=0; i<c.size(); i++)
	          {
		     if(Y.equals(c.get(i).getCourseID()))
		        {
			   System.out.println("\nYOU ARE ALEADY ENROLLED IN THIS COURSE\n");
			   acc=true;	
			    e=true;
	     		}
	            }
	     if (c.size()==4)
		{
	         System.out.println("Course Added now will be consider as your 2nd Choice (SECONDORY COURSES)");
		}
		
		
	   if(c.size()<6)
	      {
 		if (acc==false)
		{
		
   	  	 for (int i=0; i<d.size(); i++)
		   {
		     if(Y.equals(d.get(i).getCourseID()))
		        {
			   
			    if (d.get(i).getNumberOfStudents()<9)
			   {
			         System.out.println("\nTHIS COURSE IS OFFERED THIS SEMESTER");
				 
				 d.get(i).setNumberOfStudents(-1);
			  	 Course g = new Course(d.get(i).getName(),d.get(i).getCourseID(),d.get(i).getProfessor(),d.get(i).getPreReq(),(d.get(i).getNumberOfStudents()));
			   	 c.add(g);
				System.out.println("\n");
				 System.out.println("Your update Semester fees is: " + c.size()*2500);	
				System.out.println("\n");
			  	 e = true;
				
				System.out.println("SUCCESSFULLY ENROLLED");
			   }	
			   else if (d.get(i).getNumberOfStudents()>=9)
			       {
				 System.out.println("YOU CANNOT REGISTER FOR THIS COURSE LIMIT EXCEEDED");
			      	//Course h = new Course(d.get(i).getName(),d.get(i).getCourseID(),d.get(i).getProfessor(),d.get(i).getPreReq(),d.get(i).getNumberOfStudents());
			      	d.remove(i); 
				 e = true;
			       }
				else
				{
		                  
				}
	                    }
		         }
                     }
			 if(e==false)
		          {
			     System.out.println("THIS COURSE IS NOT OFFERED THIS SEMESTER");
			  }
			   
	       
				
		System.out.println("Your updated COURSELIST: \n");
			for (int y =0; y<c.size(); y++) 
 	   	 	 {
          	             System.out.println(y+1 + "). " + c.get(y).toString());
	   		 }

	}
		else 
		{
		   System.out.println("YOU CANNOT REGISTER INTO MORE COURSES LIMIT IS 6");
		}	
	
	}
	  
		

	public static void main(String[] args) throws Exception 
         {
		  Course M= new Course ("COMPUTER SCIENCE", "CS2463", "Dr.Kim", "CS1322, CS2233", 3);
 		  Course N= new Course ("INFORMATION AND MANAGEMENT", "INFO1103", "Dr.Kaser", "INF832, CS1003", 7);
 		  Course O= new Course ("CHEMISTRY", "CHE3623", "Dr.Kaser", "CHE1042, CHEM883", 6);
  		  Course P= new Course ("CIVIL ENGINEERING", "CE2203", "Dr.Riley", "MATH1052, CE1031", 9);
  		  Course Q= new Course ("BIOLOGY", "BIO1003", "Dr.Bye", "BIO799, SCIE1083", 5);
  		  Course R= new Course ("BUSINESS ADMINISTRATION", "BA2503", "Dr.Kim", "BA782, MATH933", 4);
 		  Course S= new Course ("ACCA", "AC2233", "Dr.This", "AC1222, AC533", 4);
 		  Course T= new Course ("FAMILY MANAGEMENT", "FML2223", "Dr.Before", "SCIE2322, PHYC2233", 3);
 		  Course U= new Course ("FRENCH", "FR1903", "Dr.Before", "FR1803", 5);
		  Course V= new Course ("FARSI", "FRS3603", "Dr.Now", "FRS3502, FRS1053", 9);
		  Course W= new Course ("ANTHROPOLOGY", "AN1403", "Dr.Now", "AN1002", 3);
                 Course X= new Course ("COUMPUTER SCIENCE", "CS1403", "Dr.Kim", "CS1092, MATH1033", 7);
		Course Y= new Course ("ELECTRICAL ENGINEERING", "ECE2214", "Dr.Gadoura", "ECE2221, CS1233", 6);
		Course Z= new Course ("MECHANINCAL ENGINEERING", "ME2321", "Dr.Gadoura", "CS1222, ME2323", 7);
		ArrayList<Course> allcourse = new ArrayList<>();
		allcourse.add(M);allcourse.add(N);allcourse.add(O);allcourse.add(P);
		allcourse.add(Q);allcourse.add(R);allcourse.add(S);allcourse.add(T);
   		allcourse.add(U);allcourse.add(V);allcourse.add(W);allcourse.add(X);
		allcourse.add(Y);allcourse.add(Z);
		ArrayList<Course> course1= new ArrayList<>();
		ArrayList<Course> course2= new ArrayList<>();
		ArrayList<Course> course3= new ArrayList<>();
		ArrayList<Course> course4= new ArrayList<>(); 
		//ArrayList<Course> coursep1= new ArrayList<>(); 
		//ArrayList<Course> coursep2= new ArrayList<>(); 
		//ArrayList<Course> coursep3= new ArrayList<>(); 
		//ArrayList<Course> coursep4= new ArrayList<>(); 
		course1.add(Y);course1.add(Z);
		course2.add(X);course2.add(Y);
		course3.add(X);course3.add(Z);course3.add(Q);course3.add(P);
		course4.add(X);course4.add(Y);course4.add(Z);course4.add(O);course4.add(M);course4.add(N);
		
              Student A = new Student("Shehryar Baig","XYX@abc","1234","0000",course1);
                Student B = new Student("Jean","asX@abc","5678","5678",course2);
                  Student C = new Student("Max","mX@abc","3668","9999",course3);
		    Student D = new Student("Negar","NX@abc","2668","888",course4);



	
	Professors E = new Professors("9689", "hello", "Dr.Kim", "m@mail.com");
	Professors F = new Professors("9857", "unbsj", "Dr.Gadoura", "g@mail.com");
	Professors G = new Professors("2563", "nottellingyou", "Dr.Now", "n@mail.com");
	Professors H = new Professors("1459", "byebye", "Dr.Kaser", "k@mail.com");
	
	
	ArrayList <Professors> Array1 = new ArrayList<>();
	Array1.add(E);
	Array1.add(F);
	Array1.add(G);
	Array1.add(H);
	
	

        ArrayList <Student> Array = new ArrayList<>();
	Array.add(A);
	Array.add(B);
	Array.add(C);
	Array.add(D);

  	 try
        {
            FileOutputStream fos = new FileOutputStream("Student");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Array);
            oos.close();
            fos.close();
        } 
        catch (IOException ioe) 
        {
            ioe.printStackTrace();
        }
  	

	 try
        {
            FileOutputStream f = new FileOutputStream("Catalog");
            ObjectOutputStream s = new ObjectOutputStream(f);
	    s.writeObject(allcourse);
            s.close();
            f.close();
        } 
        catch (IOException ie) 
        {
            ie.printStackTrace();
        }
	
	try
        {
            FileOutputStream s = new FileOutputStream("Professors");
            ObjectOutputStream oo = new ObjectOutputStream(s);
            oo.writeObject(Array1);
            oo.close();
            s.close();
        } 
        catch (IOException ioe) 
        {
            ioe.printStackTrace();
        }
	
	

	 }





















		// remove that specific course from array
		/* setSchedule */
	//}

	//public void add() {
		// if deadline crossed cant add
		// calling catalog();
		// whatever the student select add to course Array
		/* setSchedule */
	//}

	//public void printSchedule() {
		//Scanner scan = new Scanner(System.in);

		//System.out.println("Do you want to print the courselist? Yes/No ");

		//String a = scan.next();
		//if (a.equals("Yes")) {
			//for (int i = 0; i < schedule.length; i++) {
				//ystem.out.println(schedule[i]);
			//}
		//}
		//scan.close();
		//System.out.println(getSchedule());
	//}

	
}
