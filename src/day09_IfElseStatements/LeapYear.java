package day09_IfElseStatements;

public class LeapYear {
    public static void main(String[] args) {

int year=2000;

boolean LeapYear= year % 4==0;

if (LeapYear){
    System.out.println("Year " + year + " is a leap year");
}

        if (!LeapYear){
            System.out.println("Year " + year + " is not  a leap year");
        }

        System.out.println("-----------------------------");

        if(LeapYear){
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is a leap year");


            System.out.println("Year " + year + " is a not leap year");
        }

    }




}
