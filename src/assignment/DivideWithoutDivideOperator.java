package assignment;

public class DivideWithoutDivideOperator {
    public static void main(String[] args) {
        int n1 = 12;
        int n2 = 3;
        int count=0;
        while(n1>=n2){
            n1=n1-n2;
            count++;
        }
        System.out.println(count);
    }
}
