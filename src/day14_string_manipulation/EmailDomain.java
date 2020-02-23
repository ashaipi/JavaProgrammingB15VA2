package day14_string_manipulation;

public class EmailDomain {
    public static void main(String[] args) {
        String email = "employee@gmail.com";
        if(email.contains("@gmail")) System.out.println("Google Account");
        else if(email.contains("@yahoo")) System.out.println("yahoo Account");
        else if(email.contains("@hotmail")) System.out.println("hotmail Account");
        else if(email.contains("@icloud")) System.out.println("icloud Account");
        else System.out.println("Some other account");
    }
}
