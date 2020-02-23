package day26_arrays05;

import org.w3c.dom.ls.LSOutput;

public class CarsArray {
    public static void main(String[] args) {
            /*
    American -> Ford, Chevy
    Japanese -> Toyota, Honda, Mazda
    Korean -> Kia, Hyundai
    German -> Bmw, Audi, Mercedes
    Italy -> Fiat, Ferrari, Alfa Romeo
    French -> Bugatti, Renault
     */
        String[] myCars = {"Ford", "Chevy","Toyota", "Honda", "Mazda", "Kia", "Hyundai", "Bmw",
                "Audi", "Mercedes", "Fiat", "Ferrari", "Alfa Romeo", "Bugatti", "Renault"};
        for (int i = 0; i < myCars.length ; i++) {
            switch (i) {
                case 0: case 1: System.out.printf("%-10s is American car\n",myCars[i]); break;
                case 2: case 3: case 4: System.out.printf("%-10s is Japanese car\n",myCars[i]); break;
                case 5: case 6: System.out.printf("%-10s is Korean car\n",myCars[i]); break;
                case 7: case 8: case 9: System.out.printf("%-10s is German car\n",myCars[i]); break;
                case 10: case 11: case 12: System.out.printf("%-10s is Italy car\n",myCars[i]);  break;
                case 13: case 14: System.out.printf("%-10s is French car\n",myCars[i]); break;
            }
        }
    }

}
