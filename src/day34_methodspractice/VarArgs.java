package day34_methodspractice;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        sum(20);
        sum(23,43);
        sum(23,45,67,897,56,23,12,2,5);
        sum();
    }

    public static void sum(int... nums){
        System.out.println(Arrays.toString(nums));
    }
}
