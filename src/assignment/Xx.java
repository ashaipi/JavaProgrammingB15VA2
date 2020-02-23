package assignment;

public class Xx {
    public static void main(String[] args) {
        String str = "JavaX";
        if(str.indexOf("x")==0 || str.indexOf("X")==0) str=str.substring(1);
        if(str.lastIndexOf("X")==(str.length()-1)) str=str.substring(0,str.length()-1);
        if(str.lastIndexOf("x")==(str.length()-1)) str=str.substring(0,str.length()-1);
        System.out.println("str = " + str);

    }
}
