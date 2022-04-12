package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullName= input.nextLine();

        System.out.println("Enter your building number:");
        String building= input.next();

        input.nextLine();

        System.out.println("Enter your Street name:");
        String street= input.nextLine();

        System.out.println("Enter your city name:");
        String city= input.nextLine();

        System.out.println("Enter your state name:");
        String state= input.nextLine();

        System.out.println("Enter your zip code:");
        String zipCode= input.next();

        input.nextLine();


        System.out.println("Enter your country name:");
        String country= input.nextLine();


        System.out.println("fullName = " + fullName);
        System.out.println("building = " + building);
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("country = " + country);

    }
}

