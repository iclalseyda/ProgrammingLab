package day08_IfStatements;

import javax.lang.model.SourceVersion;

public class NumberOfTheDayInMonth {
    public static void main(String[] args) {

        int number= 5;

boolean has28Days= number== 2;
boolean has30Days= number==4 || number==6 || number==9 || number==11;
        boolean has31Days= !has28Days && !has30Days;

      if (has28Days){ System.out.println("28 days");}
      if (has30Days){
          System.out.println("30 days");}
if (has31Days){
    System.out.println("31 Days");
}


    }
}
