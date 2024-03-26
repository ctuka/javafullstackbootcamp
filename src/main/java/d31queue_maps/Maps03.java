package d31queue_maps;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.util.*;

public class Maps03 {
    public static void main(String[] args) {
        //Homework
        //Example Write code that shows how many times each word is used in a given String.
        //Operation should be case insensetive.
        //Mike is Mike
        //        expected result
        int counter ;
        String str = "Mike is Mike is Mike is never be are are away.";
        str = str.replaceAll("\\p{Punct}", "").toLowerCase();
        System.out.println("v1 => " + str);
        //Making given String as String array by dividing from spaces
        String [] strArray = str.split("[ ]" );

        //
        int strArrayLen = strArray.length;
        //Creating a set and adding array to this set for removing duplicates
        Set<String> setSet = new HashSet<>();
        for (var f : strArray) {
                      setSet.add(f);
        }

        // Creating map that requested for solution of problem
        Map<String, Integer> mapEntry =  new HashMap<>();


        //Count amount of every string in given array
        //Firs loop goes on set length count
        for (String setStr :  setSet)
        {
            counter =0;
            for (int k = 0 ; k < strArrayLen; k++) {
                if (setStr.equalsIgnoreCase(strArray[k])) {
                    //counting how many reoccurring world is in given array
                    counter++;
                }


            }
            //Adding keys and it is reoccurring values to map object
                mapEntry.put(setStr, counter);

            }
        //printing the final version of the requested map
        System.out.println(mapEntry);

    }
}
