package assignment;

public class PrintNonDuplicates {
    public static void main(String[] args) {
        String str = "java"; // jv
        String newStr="";
        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++)
                if(str.charAt(i)==str.charAt(j)) count++;
            if(count==1) newStr+=str.charAt(i);
        }
        System.out.println(newStr);
    }
}
