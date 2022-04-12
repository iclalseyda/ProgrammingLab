package day26_CustomMethodPractice;


import java.util.Arrays;

import Utility.ArraysUtility;

public class RemoveElements2 {
    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500, 600};

        numbers = removeElement(numbers, 1); //{100, 300, 400, 500, 600}

        //  numbers = removeElement(numbers, 1); //[100, 400, 500, 600]

        System.out.println(Arrays.toString(numbers));



    }

    public static int[] removeElement(int[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }


        int[] result = {};


        for (int i = 0; i < array.length; i++) {
            if (i != index) { // if the element of array is matching with the elements at given index
                result = ArraysUtility.addElement(result, array[i]);
            }

        }
        return result;
    }
}