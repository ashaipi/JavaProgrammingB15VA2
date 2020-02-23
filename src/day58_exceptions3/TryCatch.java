package day58_exceptions3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryCatch {
    public static void main(String[] args) {

        // TODO#############  Chucked exception  #################
        // Unhandled exception: java.io.FileNotFoundException
        try {
            FileReader fr = new FileReader("file.csv");
        }catch(FileNotFoundException e){
            System.out.println("FileNotFoundException is caught/Handled! ");
            System.out.println(e);
            //e.printStackTrace();
        }
        System.out.println("After try catch");

        // TODO#############  UnChucked exception  #################
        // ArrayIndexOutOfBoundsException
        try {
            int[] nums = {23, 12, 24};
            System.out.println(nums[0]);
            System.out.println(nums[2]);
            System.out.println(nums[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException is caught and handled...");
        }
        System.out.println("After Array");


    }
}
