package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter your age");
        int age= input.nextInt();

        System.out.println("Enter your fullName");
        String fullName= input.nextLine();

        System.out.println("Enter your GPA");
        double gpa= input.nextDouble();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
    }
}
