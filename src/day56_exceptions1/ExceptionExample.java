package day56_exceptions1;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Hello B15 Online Friends!");
        // int num = 2.5; Compile ERROR
        int[] nums = new int[3];
        nums[0] = 55;
        nums[1] = 56;
        nums[2] = 100;
        //nums[10] = 200;// ArrayIndexOutOfBoundsException is thrown here
        System.out.println("Bye Bye B15 Online Friends!");

        int result = 10/0; // ArithmeticException is thrown here
        System.out.println("result = " + result);
    }
}
