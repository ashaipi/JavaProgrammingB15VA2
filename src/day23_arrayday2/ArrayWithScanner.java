package day23_arrayday2;

import java.util.Scanner;

public class ArrayWithScanner {
    public static void main(String[] args) {
        int[] scores = new int[5];
        /*
        Hitters, Scrappers, Sliders, Boomers, Homers, Lightning, Chargers, Captains, Eagles
         */
        String[] team = {"Hitters", "Lightning", "Chargers", "Captains", "Eagles"};

        Scanner in = new Scanner(System.in);


        System.out.println("*** Enter Scores for each team ***");
        for (int i = 0; i < scores.length; i++) {
            //System.out.print("Enter team ["+team[i]+"] Score [0-100] for team  : ");
            System.out.printf("Enter team [%-9s] Score [0-100] for team  : ",team[i]);
            while(true){
                scores[i] = in.nextInt();
                if(scores[i]<=100 && scores[i]>=0) break;
                else System.out.print("Enter the score in range [0-100]: ");
            }

        }

    }
}
