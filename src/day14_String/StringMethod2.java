package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {

 String str= "Java is fun,I love learning Java";

 String str2= str.replace("Java", "Python");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email= "JohnSmith@yahoo.com";
        email= email.replace("yahoo", "gmail");

        System.out.println("email = " + email);

        String sentence= "Java Java Python Python C#   Python Python";
        String sentence2= sentence.replace("Python", " ");
        System.out.println("sentence2 = " + sentence2);

        String s= "dog dog dog dog dog";
        String s1= s.replace("dog", "cat");

        System.out.println("s1 = " + s1);

String s2= "C# is fun C# is cool";
s2=s2.replace(" C# ", " Java ");
        System.out.println("s2 = " + s2);


        System.out.println("--------------------------------------");


        String result="Java Java Java";
        //result= result.replace("Java", "Python"); Python Python Python
result= result.replaceFirst("Java", "Python");

        System.out.println("result = " + result);


    }
}
