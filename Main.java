import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you a Student or Professor? Type: \"P\" for professor and \"S\" for student.");
        char ch = scan.next().charAt(0);
        // System.out.println(ch);
        while(ch != 'P' && ch != 'S'){
            System.out.println("Incorrect character! Type: \"P\" for professor and \"S\" for student.");
            ch = scan.next().charAt(0);
        }
        if(ch == 'P')
            System.out.println("You picked Professor.");
        else
            System.out.println("You picked Student.");
    }
}