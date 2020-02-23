package day57_exceptions2;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Checked Exception in next line");
        try{
            Thread.sleep(500);

        }catch(InterruptedException e){
            System.out.println("Exception handled");
        }
        System.out.println("After Thread sleep");
    }
}
