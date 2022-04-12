package day21_ForeachLoop;

import java.util.Arrays;
import java.util.NavigableMap;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] nums={1,2,3,4,5};
        System.out.println(nums); // hash code
        System.out.println(Arrays.toString(nums));
        System.out.println( nums[0]);
      /*  String str= "Java";

        //System.out.println(str); // hash code
        //System.out.println(str.toString()); // hash code */
        System.out.println("-------------------------------");
        int[] scores={95, 100,55,65,85,78};

        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores);

        System.out.println(Arrays.toString(scores));

        System.out.println("Min Score:" + scores[0]);
        System.out.println("max Score:" + scores[scores.length-1]);

        String[] names= {"Gunay","Anna", "Zuhal", "Ahmet", "Maria","Sinem"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

String[] nam= {"Anna", "ANNA"};

Arrays.sort(nam);
        System.out.println(Arrays.toString((nam)));

        System.out.println("---------------------------------------------------");

        int[] arr1={1,3,2};
        int[] arr2={1,2,3};

        boolean r1= Arrays.equals(arr1,arr2);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2=Arrays.equals(arr1,arr2);

        System.out.println(r2);

        System.out.println("-----------------------------------------------------------");

        char[] ch1= {'a','c','b'};
        char[] ch2={'b','a','c'};

Arrays.sort(ch1);
Arrays.sort(ch2);

boolean anagram=Arrays.equals(ch1,ch2);
        System.out.println(anagram);

        System.out.println("------------------------------------------------------------");


    }

}
