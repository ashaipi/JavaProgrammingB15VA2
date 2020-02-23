package day23_arrayday2;

public class StudentsList {
    public static void main(String[] args) {
        //String[] students = new String[8];
        String students[] = {"Sadeg","Aziz", "Abubaker", "Luba","Anastasiia", "Roho", 
                             "Rasheed","Choki","Ahmed"};
        System.out.println("Total Students = " + students.length);
        for (int i = 0; i < students.length; i++) {
            //System.out.println("Student Name: "+students[i]+"  --> it has ["+students[i].length()+"] char");
            System.out.printf("Student Name: %-11s  --> it has [%2d] char\n",students[i],students[i].length());
        }

        System.out.println("-----------------------------");
        int count=0;
        for(String std : students)
            System.out.printf(count++ +"- Student Name: %-11s  --> it has [%2d] char\n",std,std.length());

        System.out.println("-----------------------------");
        String allFriends="";
        for(String std : students)
            allFriends+=std+", ";
        allFriends=allFriends.substring(0,allFriends.length()-2);
        System.out.println("allFriends = " + allFriends);

        System.out.println("-----------------------------");
        count=0;
        for(String std : students){
            System.out.print(std+", ");
            if(++count%2==0) System.out.println();
        }

        System.out.println("\n-----------------------------");
        for (int i = 0; i <students.length ; i+=2) {
            System.out.print(students[i]);
            if(i<students.length-1) System.out.println(", "+students[i+1]);
        }

    }
}
