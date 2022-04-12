package day20_Array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] letters=new char[26];
       /*
        letters[0]='A';
        letters[1]='B';

        */

        for (char i = 'A', j=0; i < 'Z'&& j< letters.length; i++, j++) {
            letters[j]=i;

            System.out.println(Arrays.toString(letters));
        }
    }
}
