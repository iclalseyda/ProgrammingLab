package day21_ForeachLoop;

import java.util.Arrays;

public class MergeToArrays {
    public static void main(String[] args) {

    String [] group1= {"Ali", "Layan", "Aysenur"};
    String [] group2= {"Maria","Aygun","Duygu","Suat","Valeriy"};

    String [] students= new String[group1.length +group2.length];

    int i=0;
    for (String each:group1) {
          students[i++] =each;

        }
     for(String each: group2)   {
         students[i++]=each;
     }

        System.out.println(Arrays.toString(students));


        System.out.println("----------------------------------------");

     char[] ch1= {'A','B', 'C'};
     char[] ch2= { 'D', 'E','F','G','H'};

     char[] chars=new char[ ch1.length + ch2.length];

     int j=0;

     for (char ch: ch1){

     }











    }
}
