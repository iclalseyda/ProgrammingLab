package day20_Array;

public class MinNumberOfArray {
    public static void main(String[] args) {

        int[] numbers= {100, 500,30,40,600,80,90};

        int min=numbers[0]; //100 assumption

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]< min){
                min=numbers[i];

            }

        }

        System.out.println(min);

    }
}
