package day35_wrapper_classes;

public class MethodsWithArray {
    public static void main(String[] args) {
        int[] myNums = {3, 1, 4, 10, 6, 9, 3};

        printArray(myNums);
        System.out.println(isHas10(myNums));
        System.out.println(isLongerThan3(new double[]{1,2,3.6,4,23.5,12}));
    }

    public static boolean isLongerThan3(double[] nums){
        if(nums.length>3) return true;
        return false;
    }

    public static boolean isHas10(int[] nums){
        for (int i = 0; i <nums.length ; i++)
            if(nums[i]==10) return true;
            return false;
    }

    public static void printArray(int[] nums){
        for(int e : nums) System.out.println(e);
    }
}
