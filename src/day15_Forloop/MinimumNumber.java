package day15_Forloop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int min= 2147482647; // any number that user enter will be less than 2147482647

        for(int i= 10; i<15; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if (num < min) {
                min = num;

            }
        }
            System.out.println("min = " + min);






    }
}
