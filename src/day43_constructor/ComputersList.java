package day43_constructor;
import java.util.*;

public class ComputersList {
    public static void main(String[] args) {
        // Declare List of Computers

        Computer.staticMethod();

        Computer c1 = new Computer();
        c1.staticMethod(); // WARNING: Static method should call it use class name not object name
                           // Computer.staticMethod();

        List<Computer> compList = new ArrayList<>();
        compList.add(new Computer("HP 14", "Windows 10", 219.99));
        compList.add(new Computer("Dell inspiron", "Windows 8", 419.99));
        compList.add(new Computer("Sony vio", "Windows 11", 819.99));
        compList.add(new Computer("HP 25", "Windows 7", 119.99));
        compList.add(new Computer("MacBookPro 13", "MacOS Catalina", 1819.99));
        compList.add(new Computer("Lenovo flex 15", "Windows 10", 1019.99));

        System.out.println("Number of Computers: " + compList.size());
        System.out.println("First computer brand: "+compList.get(0).getBrand());
        System.out.println("First computer price: "+compList.get(0).getPrice());

        System.out.println("----------------------------");
        Computer firstComp = compList.get(0);
        System.out.println("First computer brand: "+firstComp.getBrand());
        System.out.println("First computer price: "+firstComp.getPrice());

        for(Computer c : compList) System.out.println(c.toString());

        // print Brand and price for computers within your budget
        double myBudget = 800.0;
        for(Computer c : compList) if(c.getPrice()<=myBudget)
            System.out.println("Brand: "+c.getBrand()+", Price: "+c.getPrice());

        System.out.println("------------------------------");
        compList.forEach(i -> System.out.println(i));
        System.out.println("------------------------------");
        compList.forEach(n -> System.out.print(n.getPrice()<=myBudget?n+"\n": ""));
    }
}
