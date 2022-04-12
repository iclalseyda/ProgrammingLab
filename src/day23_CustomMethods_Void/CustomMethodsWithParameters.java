package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(10);
        System.out.println("------------------------");
        ageOfPerson(2000);
        System.out.println("--------------------");
        printNumbers(80,100);
    }

    // create a function that can check if a odd number or  even number
    public static void oddOrEven(int number){

     if (number%2== 0){
         System.out.println( number + " is even number ");
     }else{
         System.out.println(number + " is odd number");
     }


    }

//create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){
        int age =2021 - birthYear;
        System.out.println("your age is: "+ age);

    }

// create a function that can print all the numbers between X and Y
public static void printNumbers(int x,int y){
    for (int i = x+1; i < y; i++) {
        System.out.println(i);
    }


}







}
