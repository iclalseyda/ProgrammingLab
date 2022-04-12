package day20_Array;

import java.util.Arrays;

public class Alphabet {
    public static void main(String[] args) {

        char[] alphabet=new char[26]; // Z~A
        alphabet[0]= 'Z';


        /*char ch='Z';
        for (int i = 0; i < alphabet.length ; i++,ch--) {
            alphabet[i]= ch;
        }*/
for (char i=0, j='Z';i< alphabet.length; i++,j--){
    alphabet[i]= j;

}


        System.out.println(Arrays.toString(alphabet)); //print the whole array
      //  System.out.println(alphabet[0]); //printing the element of the array





    }
}
