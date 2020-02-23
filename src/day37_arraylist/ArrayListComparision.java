package day37_arraylist;
import java.util.*;

public class ArrayListComparision {
    public static void main(String[] args) {
        List<Double> nums1 = new ArrayList<>();
        nums1.add(1.2);
        nums1.add(5.2);
        nums1.add(7.5);
        nums1.add(8.0);
        nums1.add(52.5);
        
        List<Double> nums2 = nums1;

        System.out.println("nums1 = " + nums1);
        System.out.println("nums2 = " + nums2);
        System.out.println("nums1==nums2        --> "+(nums1==nums2));
        System.out.println("nums1.equals(nums2) --> "+nums1.equals(nums2));

        nums1.add(100.0);
        System.out.println("nums1 = " + nums1);
        System.out.println("nums2 = " + nums2);
        System.out.println("nums1==nums2        --> "+(nums1==nums2));
        System.out.println("nums1.equals(nums2) --> "+nums1.equals(nums2));

        List<Double> nums3 = new ArrayList<>();
        nums3.add(1.2);
        nums3.add(5.2);
        nums3.add(7.5);
        nums3.add(8.0);
        nums3.add(52.5);
        nums3.add(100.0);

        System.out.println("nums1 = " + nums1);
        System.out.println("nums3 = " + nums3);
        System.out.println("nums1==nums3        --> "+(nums1==nums3));
        System.out.println("nums1.equals(nums3) --> "+nums1.equals(nums3));
        
        
    }
}
