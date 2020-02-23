package assignment;

public class Day28 {
    public static void main(String[] args) {
        String str = "   java is fun ";
        String newStr = "";
        System.out.print("str before trim = ["+str);
        System.out.println("]");
        str= str.trim();
        System.out.println("str after trim= " + str);
        newStr = str.replaceFirst("java", "JAVA");
        System.out.println("replace first word = " + newStr);

    }
}
