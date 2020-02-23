package day26_arrays05;
import java.util.*;

public class PopularNames {
    public static void main(String[] args) {
        String[] names = {  "James","Mary",
                "John","Patricia",
                "Robert","Jennifer",
                "Michael","Linda",
                "William","Elizabeth",
                "David","Barbara",
                "Richard","Susan",
                "Joseph","Jessica",
                "Thomas","Sarah",
                "Charles","Margaret",
                "Christopher","Karen",
                "Daniel","Nancy",
                "Matthew","Lisa",
                "Anthony","Betty",
                "Donald","Dorothy",
                "Mark","Sandra",
                "Paul","Ashley",
                "Steven","Kimberly",
                "Andrew","Donna",
                "Kenneth","Emily",
                "George","Carol",
                "Joshua","Michelle",
                "Kevin","Amanda",
                "Brian","Melissa",
                "Edward","Deborah",
                "Ronald","Stephanie",
                "Timothy","Rebecca",
                "Jason","Laura",
                "Jeffrey","Helen",
                "Ryan","Sharon",
                "Jacob","Cynthia",
                "Gary","Kathleen",
                "Nicholas","Amy",
                "Eric","Shirley",
                "Stephen","Angela",
                "Jonathan","Anna",
                "Larry","Ruth",
                "Justin","Brenda",
                "Scott","Pamela",
                "Brandon","Nicole",
                "Frank","Katherine",
                "Benjamin","Samantha",
                "Gregory","Christine",
                "Raymond","Catherine",
                "Samuel","Virginia",
                "Patrick","Debra",
                "Alexander","Rachel",
                "Jack","Janet",
                "Dennis","Emma",
                "Jerry","Carolyn",
                "Tyler","Maria",
                "Aaron","Heather",
                "Henry","Diane",
                "Jose","Julie",
                "Douglas","Joyce",
                "Peter","Evelyn",
                "Adam","Joan",
                "Nathan","Victoria",
                "Zachary","Kelly",
                "Walter","Christina",
                "Kyle","Lauren",
                "Harold","Frances",
                "Carl","Martha",
                "Jeremy","Judith",
                "Gerald","Cheryl",
                "Keith","Megan",
                "Roger","Andrea",
                "Arthur","Olivia",
                "Terry","Ann",
                "Lawrence","Jean",
                "Sean","Alice",
                "Christian","Jacqueline",
                "Ethan","Hannah",
                "Austin","Doris",
                "Joe","Kathryn",
                "Albert","Gloria",
                "Jesse","Teresa",
                "Willie","Sara",
                "Billy","Janice",
                "Bryan","Marie",
                "Bruce","Julia",
                "Noah","Grace",
                "Jordan","Judy",
                "Dylan","Theresa",
                "Ralph","Madison",
                "Roy","Beverly",
                "Alan","Denise",
                "Wayne","Marilyn",
                "Eugene","Amber",
                "Juan","Danielle",
                "Gabriel","Rose",
                "Louis","Brittany",
                "Russell","Diana",
                "Randy","Abigail",
                "Vincent","Natalie",
                "Philip","Jane",
                "Logan","Lori",
                "Bobby","Alexis",
                "Harry","Tiffany",
                "Johnny","Kayla"};
        System.out.println("Names count: "+names.length);
        System.out.println(Arrays.toString(names));
        int sarahsIndex = -1;
        for (int i = 0; i < names.length ; i++) if(names[i].equals("Sarah")) {sarahsIndex=i;break;}
        System.out.println("Sarah's index = " + sarahsIndex);

        System.out.print("MALES NAMES:   ");
        for (int i = 0; i < names.length; i+=2) System.out.printf("%-11s",names[i]);

        System.out.println();
        System.out.print("FEMALES NAMES: ");
        for (int i = 1; i < names.length; i+=2) System.out.printf("%-11s",names[i]);

        System.out.println();
        System.out.println();

        String males="", females="";
        for (int i = 0; i < names.length; i+=2) {males+=names[i]+", "; females+=names[i+1]+", ";}
        System.out.println("MALES NAMES:   "+males);
        System.out.println("FEMALES NAMES: "+females);

        // check if "David is among male names
        if(males.contains("David")) System.out.println("David in the list");
        else System.out.println("David is not in the list");

        // check if "Susan" is among female names
        if(females.contains("Susan")) System.out.println("Susan in the list");
        else System.out.println("Susan is not in the list");

        String longestName ="", shortestName=names[0];
        for (int i = 0; i <names.length ; i++) {
            if(longestName.length() < names[i].length()) longestName=names[i];
            if(shortestName.length() > names[i].length()) shortestName=names[i];
        }
        System.out.println("longestName:  "+longestName);
        System.out.println("shortestName: "+shortestName);
        for (int i = 0; i <names.length ; i++) if(names[i].length()==shortestName.length()) System.out.println(names[i]);

    }
}
