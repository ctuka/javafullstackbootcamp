package d31queue_maps;

import java.util.*;
import java.util.stream.Collector;

public class Maps01 {
    public static void main(String[] args) {


        HashMap<String, Integer > stdAges = new HashMap<>();
        stdAges.put("Ismail" , 25);
        stdAges.put("Tanya" , 28);
        stdAges.put("Mikail" , 34);
        stdAges.put("Derya" , 33);
        stdAges.put("Goksen" , 45);
        stdAges.put("Talha" , 28);
        stdAges.put("Talha" , 29);
        System.out.println(stdAges);

        //How to get values from map
        Set<String> keys = stdAges.keySet();
        System.out.println(keys);

        //How to get values from map
        Collection<Integer> values = stdAges.values();
        //How can take values of map to a Array list

        System.out.println(values);

        //get() ; returns the value of specified key in method parantesis
        Integer age = stdAges.get("Tanya");
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
        Set< Map.Entry<String, Integer>> myEntrySet = stdAges.entrySet();
        System.out.println(myEntrySet);


        for (Map.Entry<String, Integer> w : myEntrySet) {
            System.out.println( w);
        }

        //You can loop over a Set Using "Map.Entry" ang get both keys(getKey()) and values (getValue()).

        for (Map.Entry<String, Integer> w : myEntrySet) {
            System.out.println(w.getKey() + " => "); //gives me only key of the pair from each entities

            System.out.println(w.getValue());  //gives me only values of the pair from each entities
        }
        //2)replace() method is used to update values using their keys
        stdAges.replace("Ismail" , 30);
        System.out.println(stdAges);

        //3) putIfAbsent() method puts the specified key-value pair to Map if the key is not already present.
        //If the key is already there, method has no effect

        stdAges.putIfAbsent("Mikail", 23);
        System.out.println(stdAges);

        stdAges.putIfAbsent("Mahmoot", 23);
        System.out.println(stdAges);

        //4) Both get() and getOrDefault() methods do the same job if the serched elemnet is in the map
        System.out.println(stdAges.get("Ismail"));
        System.out.println(stdAges.getOrDefault("Talha", -1)); //get this value if does not accet give default one

        //5) remove("key") delete an entry using the key value
        stdAges.remove("Talha");
        System.out.println(stdAges);

        //6) remove("key",  value) delete if key and values maches otherwise it does not delete

        stdAges.remove("Mikail", 34);
        System.out.println(stdAges);
    }
}
