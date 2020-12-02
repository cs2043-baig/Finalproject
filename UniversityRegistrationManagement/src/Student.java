import java.util.*;

public class Student extends User{
	private String name;
	private String email;
	private int ID;
	private String pass;
	Course[] course;

	// construct a new student with given fields
	public Student(String name, String email, int ID, String pass, Course[] course) {
		this.name = name;
		this.email = email;
		this.ID = ID;
		this.pass=pass;
		this.course=course
	}

	public Course[] getSchedule() {
		return schedule;
	}

	public void setSchedule(Course[] schedule) {
		this.schedule = schedule;
	}

	public void drop() {
		// if deadline crossed cant drop
		// remove that specific course from array
		/* setSchedule */
	}

	public void add() {
		// if deadline crossed cant add
		// calling catalog();
		// whatever the student select add to course Array
		/* setSchedule */
	}

	public void printSchedule() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Do you want to print the courselist? Yes/No ");

		String a = scan.next();
		if (a.equals("Yes")) {
			for (int i = 0; i < schedule.length; i++) {
				System.out.println(schedule[i]);
			}
		}
		scan.close();
		System.out.println(getSchedule());
	}

	public void printBilling() {
		double Fees = schedule.length * 2500;
		System.out.println("Your semester fees is: $" + Fees);
	}
}
