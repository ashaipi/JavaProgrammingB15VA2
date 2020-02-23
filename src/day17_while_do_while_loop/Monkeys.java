package day17_while_do_while_loop;

public class Monkeys {
    public static void main(String[] args) {
        int count=5;
        String monkeys;

        while(count>0){
            if(count==1) monkeys="monkey"; else monkeys="monkeys";
            System.out.println(count+" little "+monkeys+" jumping on the bed,");
            System.out.println("One fell down and bumped his head,");
            System.out.println("Mama called the doctor and the doctor said,");
            System.out.println("No more monkeys jumping on the bed!");
            --count;
        }
        System.out.println("Put those monkeys right to bed!");


    }
}
