package day06;

public class PrimitiveCasting {
    public static void main(String[] args) {

byte a= 100;
short b= a;


int c=b; // implicit casting
 long d = c;

        float e= d;
        double f= e;



        int x= 55;
        short y = (short)x; // explicit casting

        System.out.println(x + " : "  + y);

        long j = 100000;
        short k= (short)j;

        System.out.println(j + " : " +k);


double l = 2.5;
float m= (float) l;

        System.out.println( l +" : " + m);

        System.out.println("---------");


    }



}
