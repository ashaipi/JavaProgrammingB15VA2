package day24_arrays03;
import java.util.*;

public class ArraysEquals {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 2, 10};
        int[] nums2 = {4, 5, 2, 10};
        int[] nums3 = {10, 4, 5, 2};
        int[] nums4 = {4, 5, 2, 10, 90};
        int[] nums5 = {54, 23, 54, 123, 54};

        System.out.println("nums1 equals nums2: "+Arrays.equals(nums1, nums2));
        System.out.println("nums1 equals nums2: "+ (nums1 == nums2));
        System.out.println("nums2 equals nums3: "+Arrays.equals(nums2,nums3));
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        System.out.println("After sorting: nums2 equals nums3: "+Arrays.equals(nums2,nums3));

        String[] cars1 = {"Toyota", "Honda", "Tesla", "BMW", "Dodge"};
        String[] cars2 = {"Toyota", "Honda", "Tesla", "BMW", "Dodge"};
        String[] cars3 = {"toyota", "honda", "tesla", "bmw", "dodge"};
        String[] cars4 = {"Toyota", "Honda", "Tesla"};

        System.out.println("cars1 equals cars2: "+Arrays.equals(cars1, cars2));
        System.out.println("cars2 equals cars3: "+Arrays.equals(cars2, cars3));
        boolean equal = Arrays.toString(cars2).equalsIgnoreCase(Arrays.toString(cars3));
        System.out.println("After ignore case: cars2 equals cars3: "+equal);

        String[] newCars = Arrays.copyOf(cars1, 7);
        System.out.println(Arrays.toString(newCars));




    }
}
