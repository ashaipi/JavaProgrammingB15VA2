package day35_wrapper_classes;

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println(getGrade(55));
        System.out.println(getGrade(95));
        System.out.println(getGrade(85));
        System.out.println(getGrade(105));
    }

    public static char getGrade(int score){
        char grade;
        if(score >= 94 && score <=100)      grade = 'A';
        else if(score >= 80 && score <=93)  grade = 'B';
        else if(score >= 50 && score <= 79) grade = 'C';
        else if(score >= 30 && score <= 49) grade = 'D';
        else if (score <=0 && score <= 29)  grade = 'F';
        else {System.out.println("ERROR: Invalid Score-"+score); grade = '0';}
        return grade;
    }
}
