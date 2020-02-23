package day14_string_manipulation;

public class ContainsEOrA {
    public static void main(String[] args) {
        String name = "Pavel";
        if(name.contains("a") || name.contains("e")) System.out.println("There is e or a in Pavel");
        else System.out.println("There is no e or a in the name");
    }
}
