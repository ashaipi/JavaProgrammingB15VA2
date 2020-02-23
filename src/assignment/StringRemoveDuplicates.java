package assignment;

public class StringRemoveDuplicates {
    public static String RemoveDuplicates(String str){
        String newStr = "";
        while(str.length()!=0){
            newStr+=str.charAt(0);
            str=str.replace(""+str.charAt(0),"");
        }
        return newStr;
    }

    public static void main(String[] args) {
        String str = "EAAABBBCCCD";
        System.out.println(RemoveDuplicates(str));
    }
}
