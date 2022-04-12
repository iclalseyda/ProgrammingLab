package day24_CustomMethods_Return;

public class ReturnStatements2 {
    public static void main(String[] args) {
        nameOfMonth(12);
    }

    public static void nameOfMonth(int number) {
        if (number < 1 || number > 12) {
            System.out.println("Invalid");
            return; // exits nameOfMonth method
        }


        String name = "";

        if (number >= 1 && number <= 12) {

            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "March" : (number == 4) ? "April" : (number == 5) ? "May"
                    : (number == 6) ? "Jun" : (number == 7) ? "July" : (number == 8) ? "Aug" : (number == 9) ? "sep" : (number == 10) ? "Oct"
                    : (number == 11) ? "Nov" : "Dec";

            System.out.println("name of month: " + name);


        }
    }
}