package d5scanners_incrementdecrement.d31queue_maps;

import java.util.HashMap;

public class Maps02 {
    public static void main(String[] args) {
        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ismail", 25);
        stdAges.put("Tanya", 28);
        stdAges.put("Mikail", 34);
        stdAges.put("Derya", 33);
        stdAges.put("Goksen", 45);
        stdAges.put("Talha", 28);

//no exception thrown when assigning the same entry
        stdAges.put("Talha", 28);
        System.out.println(stdAges);

        //1) The replace() method is used to update values using their keys
// Technically, you can do the same with put, but using replace provides clearer information
        stdAges.replace("Goksen", 18); //changing value of existing key
        System.out.println(stdAges); //{Tanya=28, Derya=33, Talha=28, Ismail=25, Mikail=34, Goksen=18}

        //2) The replace() method can also work by checking the old value
        //assign new value conditionally
        stdAges.replace("Derya", 33, 17);//if old value matches, new values will be assigned
        System.out.println(stdAges);


// 3) The putIfAbsent() method adds the specified key-value pair to the Map if the key is not already present.
// If the key is already there, the method has no effect.

        stdAges.putIfAbsent("Mikail" , 23);
        System.out.println(stdAges);

        //4) Both get() and getOrDefault() method do the same job if the searched element is in the map

        System.out.println(stdAges.get("Ismail")); //25
        System.out.println(stdAges.getOrDefault("Tanya", 404));
        System.out.println(stdAges.getOrDefault("Ali", 404));
        //returns value of key if exists, otherwise defaultone will return

        // 5) The remove("key"); method is used to delete any entry using key
        stdAges.remove("Talha");
        System.out.println(stdAges);

        //6) remove("key", value); method checks both and the values , and deletes if match, otherwise it does not delete
        stdAges.remove("Mikail", 34);
        System.out.println(stdAges);

    }
}
