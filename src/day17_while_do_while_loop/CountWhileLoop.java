package day17_while_do_while_loop;

public class CountWhileLoop {
    public static void main(String[] args) throws Exception{
        int counter=0;
        while(counter<10){
            System.out.print(++counter+" ");
            Thread.sleep(100);
        }
        System.out.println();
        counter++;
        while(counter>0){
            System.out.print(--counter+" ");
            Thread.sleep(100);
        }

    }
}
