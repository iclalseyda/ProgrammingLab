package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstname= "Jimmy";
        String lastname = "King";
        int age = 49;
        String jobTitle= "SDET";
        String company = "Apple Inc";
        double salary = 100000.58;
        String fullName =  firstname+ " " + lastname;

        System.out.println("Full name of the person is = " + fullName);
        System.out.println(fullName + " is " + age+ " years old." );
        System.out.println(fullName + " is " + jobTitle + ",works at " + company +
        " and " + fullName + " s' salary is $" + salary);




    }


}
