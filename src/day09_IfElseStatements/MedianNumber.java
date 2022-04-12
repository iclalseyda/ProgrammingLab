package day09_IfElseStatements;

public class MedianNumber {

    public static void main(String[] args) {
        int a= 10,
         b=20,
                c=30;
        boolean aIsMedianNumber= (a>c && a<b) || (a>c && a<b);
        boolean bIsMedianNumber=  (b>c && b<a) || (b<c && b>a);
        boolean cIsMedianNumber= !aIsMedianNumber && !bIsMedianNumber;

if (aIsMedianNumber ){
    System.out.println(a + " is median number ");
}



if ( bIsMedianNumber){
    System.out.println(b + " is median number");
}


if (cIsMedianNumber) {
    System.out.println(c + " is median number");
}



    }


}
