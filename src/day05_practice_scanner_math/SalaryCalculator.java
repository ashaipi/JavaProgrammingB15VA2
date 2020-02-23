package day05_practice_scanner_math;

public class SalaryCalculator {
    public static void main(String[] args){
        double hourlyRate;
        double weeklySalary, monthlySalary, annualSalary;

        hourlyRate = 10;                             // Salary $55 by hour
        weeklySalary = hourlyRate * 40;              //  (8 hours * 5 days) = 40 hour
        monthlySalary = weeklySalary * 52 / 12; // 52.1429 Weeks in a year
                                                     // 52.1429 weeks divide by 12 months
        annualSalary = monthlySalary * 12;

        System.out.println("Your weekly salary : $"+weeklySalary);
        System.out.println("Your monthly salary: $"+monthlySalary);
        System.out.println("Your annual salary : $"+annualSalary);
    }
}
