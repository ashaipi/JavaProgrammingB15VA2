package day28_review;
import java.util.*;

public class ArrayRandomNumbers {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Random rd = new Random();

        for (int i = 0; i < 10 ; i++) {
            nums[i]= rd.nextInt(101);
        }
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


    }
}
