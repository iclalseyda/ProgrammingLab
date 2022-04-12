package day13_String;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your gender");
        String gender= scan.next();

        System.out.println("Enter your age");
        int age= scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your full name");
        String fullName= scan.nextLine();

        System.out.println("Enter your phone number");
        long phone = scan.nextLong();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your School Name");
        String schoolName = scan.nextLine();

        System.out.println("Enter your city name");
        String city = scan.nextLine();

        System.out.println("Enter your state name");
        String  state= scan.next();

        System.out.println("Enter your building name");
        int building = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your Street name");
        String street= scan. nextLine();



        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phone = " + phone);
        System.out.println("street = " + street);

    }
}
