package day22_arrays_intro;

public class SumOfArray {
    public static void main(String[] args) {
        // double[] prices = new double[]   / same
        double[] prices = {34.4, 123.4, 10.5, 4.33, 76.4, 90};
        double totalPrice = 0.0;

        for(double p : prices) totalPrice+= p;
        System.out.printf("Total prices: %.2f\n",totalPrice);

        double moreThan = 0.0;
        for(double p : prices) if(p>50) moreThan+= p;
        System.out.printf("Total prices: %.2f\n",moreThan);

        // loop through each item and if you find price more than 100
        // print "Item too expensive, you don't need that"
        // exit the loop

        double lessThan100 = 0.0;
        for(double t : prices) if(t>100)
        System.out.printf("%.2f - Item too expensive, you don't need that\n",t);


    }
}
