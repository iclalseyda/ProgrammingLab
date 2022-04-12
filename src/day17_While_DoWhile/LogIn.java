package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your user name: ");
        String u= scan.next();

        System.out.println("Enter your password");
        String p= scan.next();

        if (u.equals("Cydeo") && p.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            int attempts=3;
            while (! (u.equals("Cydeo") && p.equals("Cydeo123")) && attempts>0){

                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username");
                u= scan.next();

                System.out.println("Enter your password:");
                p= scan.next();
                attempts--;

            }

            if (u.equals("Cydeo")&& p.equals("Cydeo123")){
                System.out.println("Logged in");
            }else {
                System.out.println("Your account is locked");

            }

        }












    }
}
