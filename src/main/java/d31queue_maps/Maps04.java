package d31queue_maps;

import java.util.*;

public class Maps04 {
    /*  Let 's examine the concepts of Thread Safe, Multi Thread, and Synchronized.
        Thread safe means that a piece of software can be safely used by multiple threads at the same time.
        An example of thread -safe software is a system managing a bank account.This system should allow multiple customers
        to access their account at the same time, and therefore it needs to be thread safe.
                Multi - threading is the ability of software to execute multiple threads concurrently.This can allow the
        software to operate faster and more efficiently. An example of multi-threaded software is a web browser.
        A web browser can open several web pages at the same time, which is why it is multi-threaded.
                Being synchronized means that a data structure can be used by only one thread at a time.
                */
       /* a)HashMap is non-synchronized. This means that multiple threads can access a HashMap at the same
        time. For example, if one customer withdraws money while another deposits at the same time, it could result in an
        incorrect account balance. (it is also not thread-safe)
        However, synchronization must be managed manually in such cases.
        (developers use special structures like Synchronized Blocks, Locks, and Semaphores.)
         b)HashTable is thread - safe and synchronized
        (meaning that only one thread can use the same Hashtable at a time, creating a queue and extending the service
        time).
          a) HashMap allows one null key(must be unique, cannot have 2 nulls, it would overwrite) and as many null values as
        you want.
        b) Hashtable does not allow null values for either keys or values.
        Attempting to add a null value will throw a NullPointerException.
        HashMap is fast, HashTable is slower compared to HashMap.
          Note:Both HashMaps and Hashtables store their entries in a random order.
*/

    public static void main(String[] args) {
        Hashtable<String, Integer> stdGrades = new Hashtable<>();
        stdGrades.put("Sedat", 90);
        stdGrades.put("Tamara", 89);
        stdGrades.put("Kamola", 91);
        stdGrades.put("Amena", 100);
        //hashtable does not take null values for key part and value part

        //but HashMap does take null for keypart for
        HashMap<String, Integer>  stdges = new LinkedHashMap<>();

        //TreeMap
        //TreeMap keeps data in natural order so thet are very slovly
        //Null is not  allowed in key part  but you can use bull in value part
        //it orders according to the keys

        TreeMap<String, Integer> cityPlates = new TreeMap<>();
        cityPlates.put("Istanbul", 34);
        cityPlates.put("PA", 56);
        //key purt null is not accepted buy you can use on value part


        //LinkedHasMap:
        //It keeps entries insertion order
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Goksen", 20);
        lhm.put("Derya", 62);
        lhm.put("Mansuma", 44);
        System.out.println(lhm);

        for (Map.Entry<String, Integer> entry : lhm.entrySet())
        {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " --> " + value);
        }




    }
}
