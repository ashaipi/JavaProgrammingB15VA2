package day40_custom_classes;

public class BankAccount {
    public static void main(String[] args) {
        CheckingAccount client1 = new CheckingAccount();
        client1.accountNumber=3412873491L;
        client1.accountHolder="Wooden Spoon";
        client1.balance= 500.0;

        client1.getAccountInfo();

        CheckingAccount client2 = new CheckingAccount();
        client2.setInfo(300.0, 3212445534L, "Donal Trump");
        client2.getAccountInfo();

        client1.deposit(300);
        client1.getAccountInfo();

        client2.deposit(1000);
        client2.getAccountInfo();

        client1.withdraw(100);
        client1.getAccountInfo();

        client2.withdraw(500);
        client2.getAccountInfo();

        client1.withdraw(1000);
        client1.getAccountInfo();

        client1.purchase("dd", 55.5);
        CheckingAccount myAccount = new CheckingAccount();
        myAccount.setInfo(200, 2221114444L, "Master Muhtar");
        myAccount.purchase("book", 98);
        myAccount.purchase("shoes", 120.0);
        myAccount.purchase("car tyres",450);

        System.out.println("Coded lot of java, and landed a SDET job");
        System.out.println("First month salary is direct deposited");

        myAccount.deposit(10000);
        myAccount.getAccountInfo();


    }
}
