package day16_memory_while_loop_intro;

public class StartEnd {
    public static void main(String[] args) {
                   // 0123456789012345678901234
        String str = "I am a [java] programmer";
        int start = str.indexOf("[")+1;
        int end   = str.indexOf("]");
        System.out.println(start+"  "+end+"  "+str.substring(start,end));
    }
}
