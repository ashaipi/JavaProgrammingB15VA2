package day62_collections4;
import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {
        // Declare hashmap
        Map rawMap = new HashMap();

        rawMap.put(1234,4567);
        rawMap.put(true,false);
        rawMap.put("key","value");
        rawMap.put("potatoes", 7.0);
        System.out.println(rawMap);

        //Declare polymorphic Map<Integer, String>
        Map<Integer, String> employees = new HashMap<>();
        HashMap<Integer, List<String>> empMap = new HashMap<>();

        List<Map<Integer, String>> list = new ArrayList<>();

        employees.put(10, "Wali");
        employees.put(20, "Nijat");
        employees.put(30, "Yassine");
        employees.put(40, "Amir");
        employees.put(50, "Luba");
        employees.put(60, "May");
        employees.put(70, "Imad");
        employees.put(80, "Nassif");
        System.out.println(employees);

        System.out.println("80-"+employees.get(80));
        System.out.println("------------------------");
        Random r = new Random();
        for(int j=0; j<50;j++) {
            int i = r.nextInt(90);
            if(employees.get(i)!=null)
                System.out.println(i + " - " + employees.get(i));
        }
        System.out.println("------------------------");

        employees.replace(40, "Tahmina");
        int id = 40;
        System.out.println(id+" - "+employees.get(id));
        System.out.println(employees);

        employees.replace(40, "Imtiaz");
        System.out.println(id+" - "+employees.get(id));
        System.out.println(employees);
        System.out.println("------------------------");
        System.out.println("employees.size()   "+employees.size());
        System.out.println("employees.remove(10) "+employees.remove(10));
        System.out.println(employees);
        System.out.println("employees.containsKey(30) "+employees.containsKey(30));
        System.out.println("employees.containsKey(90) "+employees.containsKey(90));
        System.out.println("employees.containsValue(Nijat) "+employees.containsValue("Nijat"));
        System.out.println("employees.containsValue(Nadir) "+employees.containsValue("Nadir"));
        System.out.println("employees.isEmpty()  "+employees.isEmpty());
        System.out.println("empMap.isEmpty()  "+empMap.isEmpty());
        System.out.println("employees.keySet()  "+employees.keySet());

        Set<Integer> empIDs = employees.keySet();
        for(Integer i : empIDs) System.out.print(i+"   ");
        System.out.println();

        System.out.println("employees.values()  "+employees.values());

        Collection<String> empNames = employees.values();
        for(String s : empNames) System.out.print(s+"   ");
        System.out.println();

        Iterable<String> empNames1 = employees.values();
        for(String s : empNames1) System.out.print(s+"   ");
        System.out.println();

    }
}
