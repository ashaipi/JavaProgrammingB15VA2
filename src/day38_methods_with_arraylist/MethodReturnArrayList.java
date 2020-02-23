package day38_methods_with_arraylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MethodReturnArrayList {
    public static void main(String[] args) {
        System.out.println(getMonths());
        List<String> monthList = getMonths();
        System.out.println(monthList);
        //getMonths().set(0,"Abubaker");
        for(String m : getMonths()) System.out.println(m);

        System.out.println(getIntList(10));
        for (int i=1; i < 20 ; i++) System.out.println(getIntList(i));

        System.out.println(getRandomIntList(10));

    }

    public static List<Integer> getRandomIntList(int size){
        List<Integer> intList = new ArrayList<>();
        Random r = new Random();
        for (int i = 1; i <= size ; i++) intList.add(r.nextInt(101));
        return intList;
    }

    public static List<Integer> getIntList(int size){
        List<Integer> intList = new ArrayList<>();
        for (int i = 1; i <= size ; i++) intList.add(i);
        return intList;
    }

    public static List<String> getMonths(){
        List<String> months = Arrays.asList("January","February","March","April","May","June","July",
                                           "August","September","October","November", "December");
        return months;
    }
}
