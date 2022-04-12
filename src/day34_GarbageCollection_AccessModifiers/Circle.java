package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi= 3.14;
    public static String name= "Circle";

    public static ArrayList<Integer>numbers;

    public Circle(double radius){
        this.radius=radius;

    }

    static {
        //radius=5;
        pi=3.14;
        name= "Circle";

        numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);



    }






}
