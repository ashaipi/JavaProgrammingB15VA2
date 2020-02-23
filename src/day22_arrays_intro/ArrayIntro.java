package day22_arrays_intro;

public class ArrayIntro {
    public static void main(String[] args) {
        //declare int array with size 4
        int[] nums = new int[4];

        nums[0] = 100;
        nums[1] = 200;
        nums[2] = 700;
        nums[3] = -5;
        // nums[4] = 234; ArrayIndexOutOfBoundsException
        // print first in the array
        for (int i = 0; i < 4 ; i++) System.out.println("num["+i+"] = "+nums[i]);
        System.out.println("Number of elements "+nums.length);

        // modify index 0 to 222
        nums[0] = 222;
        for (int i = 0; i < 4 ; i++) System.out.println("num["+i+"] = "+nums[i]);

        nums[2] = nums[1];
        for (int i = 0; i < 4 ; i++) System.out.println("num["+i+"] = "+nums[i]);
    }
}
