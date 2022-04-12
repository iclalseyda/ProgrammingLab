package day32_Constructors;

public class ConstructorCall {

    public ConstructorCall(){
        System.out.println("Default Constructor");

    }

    public  ConstructorCall(int a){
        this();//Default Constructor
        System.out.println("Constructor with  int argument");
    }
    public ConstructorCall(String str){
        this(10); //Default Constructor ,  Constructor with int argument
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        ConstructorCall obj1 = new ConstructorCall();

        System.out.println("----------------------------");

        ConstructorCall obj2 = new ConstructorCall(10);

        System.out.println("----------------------------");

        ConstructorCall obj3= new ConstructorCall("Java");


    }











}
