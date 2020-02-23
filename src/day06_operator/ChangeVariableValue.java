package day06_operator;

import java.util.SortedMap;

public class ChangeVariableValue {
    public static void main(String[] args){
        int students = 50;
        System.out.println("Students: "+students);
        students = students +10;
        System.out.println("New 10 Students");
        System.out.println("Students: "+students);
        students = students - 2;
        System.out.println(" two students left");
        System.out.println("Students: "+students);
        int b15Students = 3;
        students = students + b15Students;
        System.out.println(" new 3 Students to B15");
        System.out.println("Students: "+students);

        double balance = 250.0;
        double shoesPrice = 75.5;
        System.out.println("Balance: "+balance);
        balance = balance -shoesPrice;
        System.out.println("Balance: "+balance);
        double shocksPrice = 10.99;
        balance = balance -shocksPrice;
        System.out.println("Balance: "+balance);
        double shirtPrice = 77.5 * 2;
        balance = balance - shirtPrice;
        System.out.println("Balance: "+balance);
        double sandwich = 7.99;
        balance = balance - sandwich;
        System.out.println("Balance: "+balance);
    }
}
