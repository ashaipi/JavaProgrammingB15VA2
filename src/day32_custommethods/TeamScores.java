package day32_custommethods;
import java.util.Arrays;
import java.util.Random;

public class TeamScores {
    public static void main(String[] args) {
        int[][] teamScores = new int[4][5];
        int[] teams = new int[4];
        Random rd = new Random();
        for (int i = 0; i <teamScores.length ; i++)
            for (int j = 0; j < teamScores.length; j++) teamScores[i][j]=rd.nextInt(10)+1;
        System.out.println(Arrays.deepToString(teamScores));

        for (int i = 0; i <teamScores.length ; i++) {
            for (int j = 0; j < teamScores.length; j++) teams[i] += teamScores[i][j];
            System.out.println("Team ["+(i+1)+"] Score ["+teams[i]+"]");
        }

        int max=0,team=0;
        for (int i = 0; i <teams.length ; i++) if(max < teams[i]) {max=teams[i]; team=i+1;}
        System.out.println("Team ["+team+"] is winner with high Score ["+max+"]");
    }
}
