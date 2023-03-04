package day42_MapContinue;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class IteratingMaps {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>(); // random order, accept null key & null values
        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        map.put("Arron", 78000);
        map.put("Chris", 78000);
        map.put("Breanna", 88000);

        System.out.println(map);

        System.out.println("--------------------------------------------------------------------");
        //Iterating the map by the keya

        for (String eachKey : map.keySet()){

            map.replace(eachKey, map.get(eachKey)*2);
        }
        System.out.println(map);

        System.out.println("--------------------------------------------------------------------");
        //Iteration the map by the values

        for (Integer eachValue : map.values()) {

            System.out.println(eachValue);
            }



        System.out.println("--------------------------------------------------------------------");

        // Iteration the map by entries/pairs


        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            System.out.println(eachEntry);
        }


        System.out.println("--------------------------------------------------------------------");

        for (Map.Entry<String, Integer> eachEnrty : map.entrySet()) {
            String eachKey = eachEnrty.getKey();
            Integer eachValue = eachEnrty.getValue();
            eachEnrty.setValue(eachValue + 10000);
            System.out.println(eachKey+" : "+eachValue);
        }

        System.out.println(map);
        System.out.println("--------------------------------------------------------------------");

        System.out.println("--------------------------------------------------------------------");



        }
    }

