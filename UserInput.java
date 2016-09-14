package userinput;

import java.util.Scanner;

public class UserInput {
    
    
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        System.out.println("Hello, " + answer);
        
        System.out.println("What is your first name?");
        String fname = sc.nextLine();
        System.out.println("What is your last name?");
        String lname = sc.nextLine();
        System.out.println("What is your year group? (10-13)");
        String grade = sc.nextLine();
        System.out.println("What is your student ID?");
        String ID = sc.nextLine();
        System.out.println("What is your login?");
        String login = sc.nextLine();
        System.out.println("What is your target grade?");
        String pgrade = sc.nextLine();
        
        System.out.println("Your information:");
        System.out.println("    Login:  " + login);
        System.out.println("    ID:     " + ID);
        System.out.println("    Name:   " + lname + ", " + fname);
        System.out.println("    Target: " + pgrade);
        System.out.println("    Year:   " + grade);
        
    }
    
}
