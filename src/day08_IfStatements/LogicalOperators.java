package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {
        String name="Steven";
        int age= 19;
        String Citizen= "UK";

        boolean isEligible= age>= 18 && Citizen=="USA";

        System.out.println( name + " is eligible for Vote " + isEligible);


        System.out.println("-----------------------");


        String name2 = "Josh";
        int creditScore= 720;
        int age2= 23;

boolean isEligible2= creditScore >= 700 &&  age2 >= 21;
        System.out.println(name2 + " is eligible for loan " +  isEligible2);

        System.out.println("-----------------");

        String name3="Shay";
        int age3= 21;

char gender= 'F';

boolean isEligible3= age3>= 18 && (gender== 'M' || gender == 'F');

        System.out.println(name3 + "is eligible for register  " + isEligible3);


        System.out.println("--------------------------");

String name4= "James";
        String countryOfBird="USA";
      boolean marriedToUsCitizen= false ;
        boolean isEligible4= countryOfBird == "USA" || marriedToUsCitizen == true;

        System.out.println(name4 +" is eligible for apply for US citizenship " + isEligible4);

        System.out.println(" ---------------------");

        boolean result1= true;
        boolean result2= !result1;
        System.out.println("result2 = " + result2);




    }
}
