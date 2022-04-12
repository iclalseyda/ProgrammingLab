package day15_Forloop;

public class StringMethods {

    public static void main(String[] args) {

        String str=" ";
        Boolean r= str.isEmpty(); //false

        System.out.println(r);

        boolean r1= str.isBlank(); // when there is space it is True
        System.out.println(r1);

        System.out.println("-------------------------------");

        String s1= "CYDEO";
        String s2= "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2)); //true

        System.out.println("---------------");

        String sentence= "My favorite programming language is Java";

        boolean hasCSharp=sentence.contains("C#");
        boolean hasJava= sentence.contains("Java");
        boolean hasJava2= sentence.contains("java") ;
        boolean hasJava3= sentence.toLowerCase().contains("java");


        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        System.out.println("------------------");
        String input1= "I love java";
        String input2= "Java";

        System.out.println(input1.equals(input2)); // false
        System.out.println(input1.equalsIgnoreCase(input2)); // false

        System.out.println(input1.contains("Java")); //false

        System.out.println("----------------------------------");
        String a= "Wooden Spoon";

        boolean x=a. startsWith("Woo");
        boolean y= a.endsWith("Spoon");
        boolean z= a.toLowerCase().startsWith("wooden");

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);





    }
}
