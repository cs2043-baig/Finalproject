import java.util.*;
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
        if(ch == 'P'){
            System.out.println("You picked Professor.");
        }else{
            // System.out.println("You picked Student.");
            String[] Password = new String[]{"123a","456b","789c","101d","121e"};
            boolean iv=false;
            String[] Username = new String[]{"Negar","Ahmed","Jean","Max","Shehryar"};
            System.out.print("Enter Username : ");
            String username = scan.next();
            for (int i =0; i<Username.length ; i++){
                if (username.equals(Username[i])){
                    System.out.print("Enter Password : ");
                    String password = scan.next();
                    iv = true;
                    if(password.equals(Password[i])){
                        System.out.println("Access Granted! Welcome!");
                        //Your account details//
                        break;
                    }else{
                        System.out.println("Invalid Password!");
                    }
                }
            }
            if(iv==false){
                System.out.println("Invalid Username!");
                System.out.println("If you want to create an account contact University Administration at XYZ@abc.ca");
            }
        }
            
    }
}