package day15_string_manipulation;

public class RemoveThem {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        System.out.println("sentence = " + sentence);
        String withNoSpace = sentence.replace(" ", "");
        System.out.println("withNoSpace = " + withNoSpace);
        System.out.println(sentence.replace("is ",""));
        
        String etsyResult = "iphone case (212,714 Results)";
        etsyResult=etsyResult.replace("iphone case (","")
                             .replace(" Results)","")
                             .replace(",","");
        System.out.println("etsyResult = " + etsyResult);

        String mixed = "!@J#$A%^VA*(";
        mixed=mixed.replace("!@","")
                   .replace("#$","")
                   .replace("%^","")
                   .replace("*(","");
        System.out.println("mixed = " + mixed);

        

    }
}
