package a_Repl_it;

public class As168 {
    public static void main(String[] args) {
        System.out.println(coverString("java methods", "me") ) ; //java [me]thods
    }

    public static String coverString(String main, String coverME) {
        if(main.contains(coverME)) main=main.replace(coverME,"["+coverME+"]");
        else main="["+main+"]";
        return main;

    }
}
