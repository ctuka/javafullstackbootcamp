package d5scanners_incrementdecrement.d31queue_maps;

import java.util.*;
import java.util.stream.Collector;

public class Maps01 {
    public static void main(String[] args) {


        HashMap<String, Integer > myMap = new HashMap<>();
        myMap.put("Ismail" , 25);
        myMap.put("Tanya" , 28);
        myMap.put("Mikail" , 34);
        myMap.put("Derya" , 33);
        myMap.put("Goksen" , 45);
        myMap.put("Talha" , 28);
        myMap.put("Talha" , 29);
        System.out.println(myMap);

        //How to get values from map
        Set<String> keys = myMap.keySet();
        System.out.println(keys);

        //How to get values from map
        Collection<Integer> values = myMap.values();
        //How can take values of map to a Array list

        System.out.println(values);

        //get() ; returns the value of specified key in method parantesis
        Integer age = myMap.get("Tanya");
        System.out.println(age);

        //Example : What is the avarage of people in myMap?
        int sum = 0;
        for (Integer w : values) {
            sum = sum + w;
        }
        System.out.println("Sum of map values = " + sum / values.size());

        //The entrySet() method returns a Set containing all values of HashMap
        //we put our map into set by keeping key value structure and make it avilable to itarete
        //This is the map in the Set Class
        //<> => angle brace
        Set< Map.Entry<String, Integer>> myEntrySet = myMap.entrySet();
        System.out.println(myEntrySet);


        for (Map.Entry<String, Integer> w : myEntrySet) {
            System.out.println( w);
        }

        //You can loop over a Set Using "Map.Entry" ang get both keys(getKey()) and values (getValue()).

        for (Map.Entry<String, Integer> w : myEntrySet) {
            System.out.println(w.getKey() + " => "); //gives me only key of the pair from each entities

            System.out.println(w.getValue());  //gives me only values of the pair from each entities
        }
        //replace() method is used to update values using their keys


    }
}
