package day11_string_comparison_logical;

public class LoginTest {
    public static void main(String[] args) {
        String userName = "cbtuser";
        String password = "abc123";

        if (userName.equalsIgnoreCase("cbtuser") && password.equals("abc123"))
            System.out.println("Login Successful, Welcome!");
        else if (userName.equalsIgnoreCase("cbtuser") && !password.equals("abc123"))
            System.out.println("Invalid password, try again");
        else if (!userName.equalsIgnoreCase("cbtuser") && password.equals("abc123"))
            System.out.println("Invalid username, try again");
        else
            System.out.println("Invalid username & password, try again");


        if (userName.equalsIgnoreCase("cbtuser")) {
            if (password.equals("abc123")) System.out.println("Login Successful, Welcome!");
            else System.out.println("Invalid password, try again");
        } else {
            if (password.equals("abc123")) System.out.println("Invalid username, try again");
            else System.out.println("Invalid username & password, try again");
        }

    }
}
