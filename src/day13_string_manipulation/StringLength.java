package day13_string_manipulation;

public class StringLength {
    public static void main(String[] args) {
        String school = "Cybertek School";
        System.out.println("school = " + school.length());

        int count = school.length();
        System.out.println(school + " is " + count + " characters");

        String firstName = "Abubaker", lastName = "Ashaipi";
        int fullNameCount = firstName.length() + lastName.length();
        System.out.println("fullNameCount = " + fullNameCount);

        int i = (firstName + lastName).length();
        System.out.println("i = " + i);

        String password = "cybertek123";
        if (password.length() >= 8) System.out.println("Password length matches requirement");
        else System.out.println("Password it too short, need to be minimum 8 characters");

        int pLength = password.length();
        if (pLength >= 8 && pLength <= 16)
            System.out.println("Password length matches requirement");
        else System.out.println("Password need to be minimum 8 and maximum 16 characters");
    }
}
