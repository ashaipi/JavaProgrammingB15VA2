package day37_arraylist;
import java.util.ArrayList;

public class RemoveInteger {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(2);
        nums.add(9);
        nums.add(3);
        nums.add(10);
        nums.add(11);
        nums.add(7);
        nums.add(7);

        System.out.println("Numbers Count: "+nums.size());
        System.out.println(nums);

        nums.remove(0);
        System.out.println(nums);

        nums.remove(Integer.valueOf(2));
        System.out.println(nums);

        //nums.remove(new Integer(7));
        System.out.println(nums);

        Integer n = Integer.valueOf(11);
        nums.remove(n);
        System.out.println(nums);

    }
}
