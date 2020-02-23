package day35_wrapper_classes;

import java.util.Arrays;

public class MethodsWithArrayReturn {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getDays()));
        System.out.println(getDays()[2]);
        for(String d : getDays()) System.out.println(d);
    }
    public static String[] getDays(){
        String[] days={"MON","TUE","WED","THU","FRI","SAT","SUN"};
        return days;
    }
}
