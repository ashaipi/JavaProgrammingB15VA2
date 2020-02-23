package day59_exceptions_collection1;
/*
RULE: if a method throw a checked exception, then caller is responsible to
      handle it or again declare it.
 */
public class ThrowsKeyword {
    public static void main(String[] args) {
        try {
            sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleep(int seconds) throws InterruptedException{
        System.out.println("sleeping for "+seconds+" seconds");
        Thread.sleep(seconds*1000);
    }
}
