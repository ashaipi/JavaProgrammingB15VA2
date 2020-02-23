package day32_custommethods;

import com.sun.security.jgss.GSSUtil;

public class EtsySearch {
    public static void line(){
        System.out.println("-------------------------------------------");
    }
    public static void openBrowser(){
        System.out.println("Click on Chrome icon");
        line();
    }
    public static void navigateToEtsy(){
        System.out.println("Type etsy.com to address bar\nClick on Enter");
        line();
    }
    public static void searchForWoodenSpoon(){
        System.out.println("Type wooden spoon into search field\nClick on search icon");
        line();
    }
    public static void printResults(){
        System.out.println("Total results: wooden spoon (14,581 Results)");
        line();
    }

    public static void main(String[] args) {
        openBrowser();
        navigateToEtsy();
        searchForWoodenSpoon();
        printResults();
    }
}
