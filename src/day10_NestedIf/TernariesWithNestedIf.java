package day10_NestedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int s = 85;

        if (s >= 0 && s <= 100) {

            if(s>=60) {
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid Score");


            System.out.println("------------------");
int s1= 40;

        String result= (s1>=0 && s1<=100)? (s1>60)? "Passed": "Failed": "Invalid Score";
            System.out.println(result);




        }
        }
    }