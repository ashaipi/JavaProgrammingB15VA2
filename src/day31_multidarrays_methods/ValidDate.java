package day31_multidarrays_methods;

import java.util.Arrays;

public class ValidDate {
    public static void main(String[] args) {
        int[] date = {12, 21, 2019};
        boolean isValidDate=true;

        switch (date[0]) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (date[1] <= 0 || date[1] > 31) isValidDate=false; break;
            case 4: case 6: case 9: case 11:
                if (date[1] <= 0 || date[1] > 30) isValidDate=false; break;
            case 2:
                // TODO: check february based on leap year
                if (date[1] <= 0 || date[1] > 29) isValidDate=false; break;
            default:
                isValidDate=false;
        }
        if(isValidDate) System.out.println(Arrays.toString(date));
        else System.out.println("Invalid Date");
    }
}
