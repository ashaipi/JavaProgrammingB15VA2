package day24_arrays03;

public class CopyArray {
    public static void main(String[] args) {
        int[] nums1 = {23, 55, 34, 87, 90, 123, 30};
        int[] nums2 = new int[nums1.length];
        int[] nums3 = new int[nums1.length];
        int[] nums4 = nums1;

        for (int i = 0; i < nums1.length ; i++) {
            nums2[i]=nums1[i];
            nums3[i]=nums1[i]*2;
        }

        for(int n : nums1) System.out.printf("%3d ",n);
        System.out.println();
        for(int n : nums2) System.out.printf("%3d ",n);
        System.out.println();
        for(int n : nums3) System.out.printf("%3d ",n);

        nums4[6]= 111;
        System.out.println();
        for(int n : nums4) System.out.printf("%3d ",n);

    }
}
