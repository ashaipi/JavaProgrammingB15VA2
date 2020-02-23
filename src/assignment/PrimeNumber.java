package assignment;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=100;
        for (int j = 2; j < n; j++) {
            boolean prime = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) prime = false;
            }
            if(prime) System.out.printf(" %d ",j);
        }
    }
}
