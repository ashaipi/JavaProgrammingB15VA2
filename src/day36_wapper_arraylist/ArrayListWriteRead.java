package day36_wapper_arraylist;
import java.util.ArrayList;

public class ArrayListWriteRead {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(10);
        nums.add(20);
        nums.add(21);
        nums.add(-7);
        System.out.println("Number of values: "+ nums.size());
        System.out.println("nums = " + nums);
        System.out.println("nums[0]: "+nums.get(0));
        nums.add(0,123);
        System.out.println("nums[0]: "+nums.get(0));
        System.out.println("nums = " + nums);
        for(Integer n : nums) System.out.println(n);
        System.out.println("nums = " + nums);

        nums.remove(0);
        System.out.println("nums = " + nums);
        nums.set(0, 321);
        System.out.println("nums = " + nums);




    }
}
