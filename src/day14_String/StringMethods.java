package day14_String;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String word= "Cydeo";

        char thirdChar= word.charAt(2);

       /* System.out.println("thirdChar = " + thirdChar);
        char tenthChar= word. charAt(9);

        System.out.println("tenthChar = " + tenthChar);

      */

        System.out.println("-----------------------------");

        String s1= "Batch 25 is the best batch. Java Programming language";

        int totalChars= s1.length();

        System.out.println("totalChars = " + totalChars);

        char lastChar= s1.charAt( s1.length()-1 ); // last index number
        System.out.println("lastChar = " + lastChar);

        System.out.println("-------------------------------");

        String str= "wooden spoon";
        str.toUpperCase(); // "WOODEN SPOON"

        System.out.println(str); // string is immutable  "wooden spoon" olarak kalır


        String s= "java";
        s.toUpperCase();
        s= s.toUpperCase(); // JAVA

        System.out.println(s); // JAVA

        System.out.println("-----------------------------");
        
    String str1= "   batch 25     ";
    str1=str1.trim(); // "batch 25"

        System.out.println(str1);

        String str2= "Cydeo School";

        int n1= str2.indexOf("h"); // 8
        System.out.println("n1 = " + n1);

        int n2= str2.indexOf("ool"); // 9
        System.out.println("n2 = " + n2);

        String str3= "Java Programming Language";
        int n3= str3.indexOf("amm"); //10

        System.out.println("n3 = " + n3);

        int n4= str3.indexOf("gua"); //20

        System.out.println("n4 = " + n4);

        int n5=str3.lastIndexOf("g");

        System.out.println("n5 = " + n5); //23

        System.out.println("---------------");


      String ss= "Java Nova Cava Wawa orange";

      int n6= ss.indexOf("a"); //1
        System.out.println("n6 = " + n6);
        int n7= ss.lastIndexOf("a");
        System.out.println("n7 = " + n7); //22
        
        int secondA= ss.indexOf("a ");
        System.out.println("secondA = " + secondA); //3

        int thirdA= ss.indexOf("a C");
        System.out.println("thirdA = " + thirdA); //8

        //int forthA=ss.lastIndexOf("av");


        int forthA=ss.indexOf("Ca")+1;
        //int fifthA=ss.lastIndexOf("va")+1;

        int fifthA=ss.lastIndexOf("a W");
        int sixthA=ss.lastIndexOf("aw");
       //int seventhA=ss.indexOf("a a");
        int seventhA=ss.lastIndexOf("a");


        System.out.println("forthA = " + forthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);



    }


}
