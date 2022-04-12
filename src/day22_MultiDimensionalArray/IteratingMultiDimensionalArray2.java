package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {

        int[][] arr2D={ {1,2,3},{4,5,6,7},{8,9,10,11,12,}    };

        for (int i = arr2D.length-1; i >=0 ; i--) {
            for (int j = 0; j < args.length ; j++) {
                System.out.println(arr2D[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");

        for (int i = 0; i < arr2D.length; i++) { // indexes of each 1D array from 0
            for (int j = arr2D.length - 1; j >= 0; j--) { // j: indexes of each element starting from last index
                System.out.print(arr2D[i][j]+ " ");
            }
            System.out.println();
        }




    }
}
