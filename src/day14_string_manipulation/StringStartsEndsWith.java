package day14_string_manipulation;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "selenium";
        System.out.println(word.startsWith("s"));
        System.out.println(word.startsWith("selen"));
        System.out.println(word.startsWith("ele"));

        System.out.println(word.endsWith("m"));
        System.out.println(word.endsWith("nium"));
        //Mr. -> Man
        //Mrs. -> Married woman
        //Ms. -> Single woman
        //Dr. -> Doctor
        //Prof. -> Professor

        String name = "Mr. Omer";
        if(name.startsWith("Mr.")) System.out.println("Man");
        else if(name.startsWith("Mrs.")) System.out.println("Married Women");
        else if(name.startsWith("Ms.")) System.out.println("Single Women");
        else if(name.startsWith("Dr.")) System.out.println("Doctor");
        else if(name.startsWith("Prof.")) System.out.println("Professor");
        else System.out.println("Unknown");

        String website = "www.google.com";
        if(website.endsWith(".com")) System.out.println("Commercial Website");
        else if(website.endsWith(".edu")) System.out.println("Education Website");
        else if(website.endsWith(".com")) System.out.println("Government Website");
        else System.out.println("Not in the our list");
    }
}
