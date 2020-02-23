package assignment_nov_29_2019_task2;

public class Task7 {
    public static void main(String[] args) {
        /*
        Ask user to enter valid email address
        for example :
         JSnow@NightWatch.com or
         Arya@KingsLanding.edu

         print 3 part of the email separately
         for example :
         Part1 -> JSnow  Part2 -> NightWatch Part3 ->com
         Part1 -> Arya   Part2 -> KingsLanding Part3 ->edu
         */
        String emailAddress = "JSnow@NightWatch.com";
        int index1,index2;
        index1=emailAddress.indexOf("@");
        index2=emailAddress.indexOf(".");
        System.out.println("Part1 -> "+emailAddress.substring(0,index1)
                          +"  Part2 -> "+emailAddress.substring(index1+1,index2)
                          +" Part3 ->"+emailAddress.substring(index2+1,emailAddress.length()));


    }
}
