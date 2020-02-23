package assignment;

public class User2 {
    public static void main(String[] args) {
        //user_id, user_name, age, phone_number
        String[] users = {"1, John, 25, 243-342-2342",
                          "2, Kevin, 34, 565-565-0000",
                          "3, Paul, 50, 234-121-1111",
                          "4, Mark, 42, 877-532-2342",
                          "5, Trevor, 22, 234-222-8779",
                          "6, Aeron, 50, 999-991-3453",};
        
        // we have too find out max age
        int maxAge = Integer.MIN_VALUE;
        for(String u : users){
            int age = Integer.parseInt(u.split(", ")[2]);
            if(age > maxAge) maxAge = age;
        }
        System.out.println("maxAge = " + maxAge);
        String listOfOldestUsers = "";
        for(String u : users){
            int age = Integer.parseInt(u.split(", ")[2]);
            if(maxAge == age) listOfOldestUsers+= u.substring(u.indexOf(", ")+2,u.lastIndexOf(", "))+"\n";
        }
        System.out.println(listOfOldestUsers);

    }
}
