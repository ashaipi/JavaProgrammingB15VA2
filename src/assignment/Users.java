package assignment;
import java.util.*;

public class Users {
    public static void main(String[] args) {

        //user_id, user_name, age, phone_number
        String[] users = {"1, John, 25, 243-342-2342",
                "2, Kevin, 34, 565-565-0000",
                "3, Paul, 50, 234-121-1111",
                "4, Mark, 42, 877-532-2342",
                "5, Trevor, 22, 234-222-8779",
                "6, Aeron, 50, 999-991-3453",};

        String user1 = users[0];
        System.out.println(user1);
        String[] user1Array = users[0].split(", ");
        System.out.println(Arrays.toString(user1Array));
        String user1PhoneNumber = user1Array[3];
        System.out.println(user1PhoneNumber);
        //print only names
        for (String user : users) {
            String name = user.split(", ")[1];
            System.out.println(name);
        }
        //if I want to find oldest user
        int oldest = 0;
        String nameOfOldestUser = "";
        for (String user : users) {
            //will convert string into integer
            int age = Integer.parseInt(user.split(", ")[2]);
            if (age > oldest) {
                oldest = age;
                nameOfOldestUser = user.split(", ")[1];
            }
        }
        System.out.println("Max age: " + oldest);
        System.out.println("Oldest user is: "+nameOfOldestUser+", his age is: "+oldest);

        }

    }

