package day07_operators_casting_boolean_if;
import java.util.Scanner;

public class EmailBuilder {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String firstName, lastName, companyName, email;

        System.out.println("Welcome to your new Company!");

        System.out.println("Enter first name, last name, company name:");
        firstName=in.next();
        lastName=in.next();
        companyName=in.next();
        email=firstName+"_"+lastName+"@"+companyName+".com";
        System.out.println("Your Email: "+email);

    }
}
