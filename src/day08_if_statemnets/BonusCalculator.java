package day08_if_statemnets;

public class BonusCalculator {
    public static void main(String[] args) {
        double salary=1000, sales=10000, bonus=0;

        if(sales>=10000){
            bonus += 500;
            salary += bonus;
        }else{
            bonus += 50;
            salary += bonus;
        }
        System.out.println("Your total salary is $"+salary+" and it includes bonus is $"+bonus);
    }
}
