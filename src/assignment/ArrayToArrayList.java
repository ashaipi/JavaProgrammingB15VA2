package assignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
    public static void main(String[] args) {
        //one-two-three-four-five-Six-seven-eight-nine-ten-eleven-twelve

        String[] asset = {"one", "two", "three", "four", "six", "seven", "nine"};
        List<String> assetList = Arrays.asList(asset);
        System.out.println(assetList);
        assetList.set(0,"GOLD");
        System.out.println("assetList = " + assetList);
        // assetList.remove(0);  // ERROR does not work with Arrays.asList();
        // assetList.add("ten"); // ERROR no add
        assetList.set(0,"ten");
        System.out.println(assetList.get(0));
        System.out.println("----------------------------");
        List<String> assetNewList = new ArrayList<>(Arrays.asList(asset));
        System.out.println("assetNewList = " + assetNewList);
        assetNewList.remove(0);
        System.out.println("assetNewList = " + assetNewList);
    }
}
