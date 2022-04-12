package day08_IfStatements;

public class SalaryCalculators {
    public static void main(String[] args) {


        int hourlyRate = 50;
        int weeklyRate = 45;
        double stateTaxRate = 6.5,
                federalTaxRate = 26.2;
        int salaryBeforeTax = hourlyRate * weeklyRate * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double federalTax = salaryBeforeTax * federalTaxRate / 100;
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;


        System.out.println("Gross pay is: $ " + salaryAfterTax );
        System.out.println("State Tax is: $ " + stateTax);



    }
}