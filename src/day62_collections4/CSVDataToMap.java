package day62_collections4;
import assignment.Array;

import java.util.*;
import java.nio.file.*;
import java.io.*;

public class CSVDataToMap {
    public static void main(String[] args) throws Exception{
        String fileName = "countryCodes.csv"; // file name with path
        File dataFile = new File(fileName);
        System.out.println("Is file ["+fileName+"] exist: "+dataFile.exists());

        Scanner scan = new Scanner(dataFile);
        //System.out.println(scan.nextLine());
        //System.out.println(scan.nextLine());
/*
        int counter=1;
        while(scan.hasNextLine())
            System.out.println(counter++ +".  "+scan.nextLine());
*/
        List<String> fileDataList = new ArrayList<>();
        while(scan.hasNextLine()) fileDataList.add(scan.nextLine());

        scan.close();

        System.out.println(fileName + " contains " + fileDataList.size() + " rows");

        System.out.println("--- Read from CSV file using new way ---");
        List<String> countryCodeList = Files.readAllLines(Paths.get(fileName));
        System.out.println(countryCodeList.size());
        System.out.println(countryCodeList.get(0));
        System.out.println(countryCodeList.toString());

        // how to retrieve unique/non-duplicate country code?
        countryCodeList.remove(0);
        System.out.println("-----------------------------");
        Set<String> countryCodeSet = new HashSet<>(countryCodeList);
        System.out.println(countryCodeSet.size());
        System.out.println(countryCodeSet.toString());

        System.out.println("-----------------------------");
        // Store each country code and country name into HashMap
        // key -> Country code, Value -> Country name
        Map<String, String> countriesMap = new HashMap<>();
        // loop through the countryCodeSet
        // split each value with coma
        // store index 0 as a key, and index 1 as a value to the map
        for(String c : countryCodeSet) {
            System.out.println(c);
            String[] countries = c.split(",");
            countriesMap.put(countries[0],countries[1]);
        }
        System.out.println("-----------------------------");
        System.out.println(countriesMap.size());
        System.out.println(countriesMap.toString());
        System.out.println(countriesMap.get("LY"));

        countriesMap.forEach((k,v) -> System.out.println(k+" - "+v));

        for(String eachKey : countriesMap.keySet())
            System.out.println(eachKey + " <---> "+countriesMap.get(eachKey));

        System.out.println("--- Print all values using EntrySet ---");
        for(Map.Entry<String, String> entry : countriesMap.entrySet()){
            System.out.print(entry.getKey()+"    ");
            System.out.println(entry.getValue());
        }

    }
}
