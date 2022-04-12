package day14_String;

public class StringMethod3_substring {
    public static void main(String[] args) {

        //subString(beginning index, ending index)

        String Word= "Cydeo School";
        //            01234

    String brand= Word.substring(0, 4 +1);
        System.out.println("brand = " + brand);

String str1= Word.substring(6);
        System.out.println("str1 = " + str1);

        String word2= "Java Programming language";

        String s1= word2.substring(0, word2.indexOf(" ")); // Java
        String s2= word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" ")); //Programming
        String s3= word2.substring(word2.lastIndexOf(" ")+1 );// language

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);


    }
}
