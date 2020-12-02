import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] password;
        String[] username;
        System.out.println("Are you a Student or Professor? Type: \"P\" for professor and \"S\" for student.");
        char ch = scan.next().charAt(0);
        // System.out.println(ch);
        while(ch != 'P' && ch != 'S'){
            System.out.println("Incorrect character! Type: \"P\" for professor and \"S\" for student.");
            ch = scan.next().charAt(0);
        }
        if(ch == 'P'){
            password = new String[]{"123a","456b","789c","101d","121e"};
            boolean iv=false;
            username = new String[]{"Negar","Ahmed","Jean","Max","Shehryar"};
            System.out.print("Enter Username : ");
            String name = scan.next();
            for (int i =0; i<username.length ; i++){
                if (name.equals(username[i])){
                    System.out.print("Enter Password : ");
                    String psswd = scan.next();
                    iv = true;
                    if(psswd.equals(password[i])){
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
        }else{
            // System.out.println("You picked Student.");
            password = new String[]{"123a","456b","789c","101d","121e"};
            boolean iv=false;
            username = new String[]{"Negar","Ahmed","Jean","Max","Shehryar"};
            System.out.print("Enter Username : ");
            String name = scan.next();
            for (int i =0; i<username.length ; i++){
                if (name.equals(username[i])){
                    System.out.print("Enter Password : ");
                    String passwd = scan.next();
                    iv = true;
                    if(passwd.equals(password[i])){
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