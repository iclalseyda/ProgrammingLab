package day16_ForLoopStringPractice;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabccc";
        String result = "";

        char ch='a';

        int count= 0; // represent the frequency of the ch

        for (int i = 0; i < str.length(); i++) { // i: index numners of str (starting from 0)

            char each = str.charAt(i);
            if (str.indexOf('a') == str.lastIndexOf('a')) { // if the first and last character are same , then the c is unique
                result += ch;
            }
        }
        System.out.println(result);
    }
}