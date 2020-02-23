package day08_if_statemnets;

public class CheckPinCode {
    public static void main(String[] args) {
        int secretPinCode = 2345;
        int inputPinCode = 2345;
        System.out.println("Welcome to Wells Fargo ATM!");

        if(inputPinCode==secretPinCode){
            System.out.println("Welcome to your Account");
            System.out.println("You can withdraw, deposit, view balances");
        }
        else{
            System.out.println("Invalid pincode!");
            System.out.println("Access Denied!");
        }
        System.out.println("Thank you for your business! Bye");
    }
}
