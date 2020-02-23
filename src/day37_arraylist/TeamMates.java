package day37_arraylist;
import java.util.ArrayList;

public class TeamMates {
    public static void main(String[] args) {
        // declare array list
        ArrayList<String> team = new ArrayList<>();
        team.add("Marufjon");
        team.add("Vasyl");
        team.add("Master Muhtar");
        team.add("Kuzzat Alty");
        team.add("Luis the Boss");
        team.add("Murodil");
        team.add("Nadir- dont forget");
        team.add("Mike - YNFJ");
        team.add("Asiya - in our group");

        System.out.println("Team size: "+team.size());

        team.add("Akbar - Online Java");

        System.out.println("Team size: "+team.size());

        // print first and last person
        System.out.println("First: "+team.get(0));
        System.out.println("Last:  "+team.get(team.size()-1));

        // print each value
        for(String p : team) System.out.println(p);
        System.out.println("-----------------------");
        for (int i = 0; i < team.size() ; i++) System.out.println(i+1+"- "+team.get(i));
        System.out.println("-----------------------");

        // print each person in reverse order
        for (int i = team.size()-1 ; i >= 0 ; i--) System.out.print(team.get(i)+", ");
        System.out.println();
        System.out.println("-----------------------");

        team.add("Walid");

        for (int i = 0; i < team.size() ; i+=2)
            if(i==team.size()-1) System.out.println(team.get(i));
            else System.out.printf("%-20s | %s\n",team.get(i),team.get(i+1));
        System.out.println("-----------------------");

        String allTeam="";
        for(String p : team) allTeam+=p+" - ";
        System.out.println(allTeam.substring(0,allTeam.length()-3));

    }
}
