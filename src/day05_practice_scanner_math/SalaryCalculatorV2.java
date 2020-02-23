package day05_practice_scanner_math;
import java.util.Scanner;
public class SalaryCalculatorV2 {
        public static void main(String[] args){

            Scanner in= new Scanner(System.in);

            System.out.print("Enter hourly rate: ");
            double hourlyRate = in.nextDouble();                // Salary by hour
            double weeklySalary = hourlyRate * 40;              //  (8 hours * 5 days) = 40 hour
            double monthlySalary = weeklySalary * 52 / 12; // 52.1429 Weeks in a year
            // 52.1429 weeks divide by 12 months
            double annualSalary = monthlySalary * 12;

            System.out.println("Your weekly salary : $"+weeklySalary);
            System.out.println("Your monthly salary: $"+monthlySalary);
            System.out.println("Your annual salary : $"+annualSalary);
        }

}
