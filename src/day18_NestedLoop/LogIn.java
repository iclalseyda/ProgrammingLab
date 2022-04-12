package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println(" Enter your user name:");
        String u= scan.next();

        System.out.println("Enter your password");
        String p=scan.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")){
            System.out.println("Logged In");
        }else {
            for (int i = 1; i < 4 ; i++) {
                System.out.println("Incorrect user name or password");
                System.out.println(" Enter your user name:");
                u=scan.next();
                System.out.println("Enter your password");
                p=scan.next();

                if (u.equals("Cydeo") && p.equals("Wooden Spoon")){
                    System.out.println("Logged In");
                    break;
               }

          }
          if (! (u.equals("Cydeo") && p.equals("Wooden Spoon"))){
                System.err.println("Your account is locked.");
        }
        }

        scan.close();

    }
}