package day24_arrays03;
import java.util.Arrays;
public class ArraysSort {
    public static void main(String[] args) {
        int[] nums = {23, 5, 12, 3, 897, 4, 56, 0, 30};
        System.out.println("before sorting");
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("after sorting");
        System.out.println(Arrays.toString(nums));

        // declare companies array and assign 4 companies
        String[] companies = {"Cybertek", "Capital one", "FreddieMac", "apple", "Google", "verizon"};
        System.out.println("before sorting");
        System.out.println(Arrays.toString(companies));
        Arrays.sort(companies);
        System.out.println("after sorting");
        System.out.println(Arrays.toString(companies));

    }
}
