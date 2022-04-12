package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {


        int a= 5;
                ++a; // pre increment the value by 1 right away
        System.out.println(a); //6
        --a; // pre decrement the value by 1 right away

        System.out.println(a); // 5


        int b= 100;
                ++b; // pre increment 101 immediately

        int c= 100 ;
        c++; // post increment

        System.out.println(c++);
        System.out.println(c);


int z= 45;
        System.out.println(++z); //46
        System.out.println(z++); //46
        System.out.println(z); // 47

int q= 30;
        System.out.println(--q); // 29
        System.out.println(q--); // 29
        System.out.println(q); //28

    }


}
