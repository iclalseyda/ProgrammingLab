package day21_ForeachLoop;

public class ForEachLoopIntro {
    public static void main(String[] args) {

        int [] numbers={10,20,30,40,50,60,70};

        for (int i = 0; i < numbers.length ; i++) {
            int eachElement=numbers[i];

            System.out.println(eachElement);
        }
        System.out.println("------------------------------------------------");

        for (int each:numbers) {
            System.out.println(each);
        }





    }
}
