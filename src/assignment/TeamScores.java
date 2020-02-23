package assignment;
import java.util.*;

public class TeamScores {
    public static void main(String[] args) {
        int[][] teamScores = new int[4][5];
        Random rd = new Random();
        for (int i = 0; i <teamScores.length ; i++)
            for (int j = 0; j < teamScores.length; j++) teamScores[i][j]=rd.nextInt(10)+1;
        System.out.println(Arrays.deepToString(teamScores));

        int max=0, team=0;
        for (int i = 0; i <teamScores.length ; i++)
            for (int j = 0; j < teamScores.length; j++)
                if(max < teamScores[i][j]) {max=teamScores[i][j]; team=i+1;}

        for (int i = 0; i <teamScores.length ; i++)
            for (int j = 0; j < teamScores.length; j++)
                if(teamScores[i][j]==max) System.out.println("Team ["+(i+1) +"] has high SCORE ["+max+"]");
    }
}
