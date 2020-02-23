package day25_arrays04_split;

public class TimesArray {
    public static void main(String[] args) {
        int[] time1={21,12,20};
        int[] time2={21,12,13};
        boolean time = time1[0]>=0 && time1[0]<=23 && time1[1]>=0 && time1[1]<=59 && time1[2]>=0 && time1[2]<=59 &&
                       time2[0]>=0 && time2[0]<=23 && time2[1]>=0 && time2[1]<=59 && time1[2]>=0 && time1[2]<=59;

        if(time) {
            if (time1[0] < time2[0])
                System.out.println("time1 is earlier - " + time1[0] + ":" + time1[1]);
            else if (time1[0] > time2[0])
                System.out.println("time2 is earlier - " + time2[0] + ":" + time2[1]);
            else if (time1[1] < time2[1])
                System.out.println("time1 is earlier - " + time1[0] + ":" + time1[1]);
            else if (time1[1] > time2[1])
                System.out.println("time2 is earlier - " + time2[0] + ":" + time2[1]);
            else if (time1[2] < time2[2])
                System.out.println("time1 is earlier - " + time1[0] + ":" + time1[1]);
            else if (time1[2] > time2[2])
                System.out.println("time2 is earlier - " + time2[0] + ":" + time2[1]);
            else System.out.println("Same time");
        }else System.out.println("Time ERROR");
    }
}
