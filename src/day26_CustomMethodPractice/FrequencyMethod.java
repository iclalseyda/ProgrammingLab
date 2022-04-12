package day26_CustomMethodPractice;


public class FrequencyMethod {
    public static void main(String[] args) {
        int[] arr={1,2,1,1,2,2,2,3,3,4,4,4,4};

        int n=frequencyOfElement(arr,4);
        System.out.println(n);
    }

    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;

            }
        }
        return count;
    }

    public static double frequencyOfElement(double[] array, double element) {
        double count = 0;
        for (double each : array) {
            if (each == element) {
                count++;

            }
        }
        return count;
    }

    public static char frequencyOfElement(char[] array, char element) {
        char count = 0;
        for (char each : array) {
            if (each == element) {
                count++;

            }
        }
        return count;
    }

    public static int frequencyOfElement(String[] array, String element) {
       int count = 0;
        for (String each : array) {
            if (each == element) {
                count++;

            }
        }
        return count;
    }
    
}

