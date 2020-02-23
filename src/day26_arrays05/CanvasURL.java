package day26_arrays05;
import java.util.*;

public class CanvasURL {
    public static void main(String[] args) {
        /*
        "www.learn.cybertekschool.com/courses/288/modules"
        URL - URI - LINK
        base url: www.learn.cybertekschool.com
        resource: courses
        Id : 288
        target: modules
         */

        String url = "www.learn.cybertekschool.com/courses/288/modules";
        // declare string array with 4 items and assign values
        //String[] urlArray = new String[4];
        String[] urlArray = url.split("/");
        System.out.println(Arrays.toString(urlArray));

        String[] inURLArray = urlArray[0].split("\\.");
        System.out.println(Arrays.toString(inURLArray));

        String[] splitURLArray = new String[urlArray.length+inURLArray.length-1];
        for (int j = 0; j < inURLArray.length ; j++)   splitURLArray[j]=inURLArray[j];
        for (int j = urlArray.length; j < splitURLArray.length ; j++) splitURLArray[j]=urlArray[j-urlArray.length+1];
        System.out.println(Arrays.toString(splitURLArray));

        for (String each : splitURLArray ) System.out.println(each);

        String id = splitURLArray[5];
        switch(id){
            case "288" : System.out.println("Java programming");      break;
            case "287" : System.out.println("Interview preparation"); break;
            case "286" : System.out.println("API Testing");           break;
            case "289" : System.out.println("QA Testing");            break;
            case "290" : System.out.println("Review Sessions");       break;
            default:     System.out.println("Unknown Course");
        }

    }
}
