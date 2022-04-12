package day25_CustomMethods_Overloading;

import Utility.StringUtility;

public class Test {
    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("--------------------------------");

        String s1 = "Wooden Spoon";

        String reverse = StringUtility.reverse(s1);

        System.out.println(reverse);

        System.out.println("--------------------------------------");

        String word = "Java";
        boolean palindrome = StringUtility.isPalindrome(word);

        System.out.println("Palindrome is " + palindrome);

        System.out.println("--------------------------------------------");





    }
}