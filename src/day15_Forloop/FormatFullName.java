package day15_Forloop;

import java.util.Locale;

public class FormatFullName {

    public static void main(String[] args) {


        String firstName= "cyDEo",
                lastName= "School";

       //firstName= firstName.substring(0,1).toUpperCase() +firstName.substring(1).toLowerCase();
            //C                             +   ydeo==>"Cydeo"
       firstName= (""+ firstName.charAt(0)).toUpperCase()+ firstName.substring(1).toLowerCase();

       lastName=lastName.substring(0,1).toUpperCase()+ lastName.substring(1).toLowerCase();


        System.out.println(firstName);
        System.out.println(lastName);

String fullName= firstName+ " "+ lastName;

        System.out.println( fullName);



    }
}
