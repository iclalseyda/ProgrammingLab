package day05_Concatenation;

public class ShippingAdress {

    public static void main(String[] args) {


        String name = " James King",
                buildingsNumber = " 12812B",
                streetName = "Jonas Branch Dr",
                city = "McLean",
                state = "VA",
                zipcode = "141252";

        String address = name + "\n" + buildingsNumber + " "
                + streetName + "\n " + city + "," + state + " " + zipcode;


        System.out.println(address);

        System.out.println();

    }

}