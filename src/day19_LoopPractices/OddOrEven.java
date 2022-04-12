package day19_LoopPractices;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter a number");
        int num =scan.nextInt();

        if (num%2==0) {
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
        System.out.println("would zou like to enter another number? (yes/no)");
        String a= scan.next();




    }
}
