package day20_Array;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);


     int[] numbers=new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers[i]=scan.nextInt();
        }
        int max= numbers[0];
        int min= numbers[0];

        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]> max){
                max=numbers[i];
        }
            if(numbers[0]< min){
                min= numbers[i];
            }

        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
