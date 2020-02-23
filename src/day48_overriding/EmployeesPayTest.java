package day48_overriding;

import day44_static.Calculator;

public class EmployeesPayTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.calculatePay(40,65);

        System.out.println("++++++++++++++++++++++++++++++");

        FullTimeEmployee femp = new FullTimeEmployee();
        femp.calculatePay(40,65);

        System.out.println("++++++++++++++++++++++++++++++");

        Contractor can = new Contractor();
        can.calculatePay(40,65);

        System.out.println("++++++++++++++++++++++++++++++");

        System.out.println(emp.toString());
        System.out.println(femp.toString());
        System.out.println(can.toString());

    }
}
