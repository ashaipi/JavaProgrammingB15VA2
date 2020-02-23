package day08_if_statemnets;

public class TeamContest {
    public static void main(String[] args) {
        int cybertekTeamScore=5, michiganTeamScore=1;

        if(cybertekTeamScore>michiganTeamScore){
            System.out.println("Cybertek Team Won the match with score "+cybertekTeamScore);
            System.out.println("Go Cybertek Team !!!");
        }else{
            System.out.println("Michigan Team Won the match with score"+michiganTeamScore);
            System.out.println("Go Michigan Team !!!");
        }
    }
}
