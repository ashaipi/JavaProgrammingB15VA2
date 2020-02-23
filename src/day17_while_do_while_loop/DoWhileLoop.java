package day17_while_do_while_loop;

public class DoWhileLoop {
    public static void main(String[] args) {
        int count=0;

        do{
            System.out.printf("%4d",count);
            count++;
        }while(count<=10);
        System.out.println();

        count=0;
        do{
            System.out.printf("%4d",count);
            count+=10;
        }while(count<=100);
    }
}
