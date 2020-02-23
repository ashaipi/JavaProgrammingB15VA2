package day61_collections3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set2.add(10);
        set2.add(10);
        set2.add(55);
        set2.add(66);
        set2.add(77);
        set2.add(88);
        set2.add(100);

        System.out.println(set2.toString());
        System.out.println(set2.size());
        //System.out.println(set2.get(0)); // there is no .get() in Set and HashSet
        System.out.println(set2.contains(100));
        System.out.println("-----------------------");

        for(int n : set2) System.out.println("n = " + n);

        System.out.println("-----------------------");
        Iterator<Integer> itSet = set2.iterator();
        System.out.println(itSet.next());

        System.out.println("-----------------------");
        while(itSet.hasNext()) System.out.println(itSet.next());
    }
}
