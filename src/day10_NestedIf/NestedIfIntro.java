package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {

int score= 400;

if(score>=0 && score<=100){        }


if(score>= 60){ System.out.println("passed");} else {
    System.out.println("failed"); }

        System.out.println("---------------");

int number=7;
if(number<=1 && number>=7){
        if(number==1) {
            System.out.println("Monday");
        } else if(number==2){
                System.out.println("Tuesday");
        } else if( number==3) {
            System.out.println("Wednesday");
        } else if (number==4) {
            System.out.println("Thursday");
        }else if (number==5) {
            System.out.println("Friday");
        } else if (number==6) {
            System.out.println("Saturday");
        }else if (number==7) {
            System.out.println("Sunday");

        }
        
        }

    }
}
