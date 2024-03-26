package d30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {
        // Set are to store uniqe data
        //1)HasSet this stores elements based on their hash number
        //Fastest performance not maintain order of elements Accept null
        String a = "Ac";
        System.out.println(a.hashCode());
        String b = "Accordition";
        System.out.println(b.hashCode());

        //2) LinkedHashSet Stores element  on their addition order
        //Child of HasSet
        //Good choose for required for order but slower than HashSet (Medium)

        //3) ThreeSet : Stores elements based on their natural order(from smallest to largest)
        //It has the slower performance compared to the HashSet and LinkedHasSet
        //Derived form SortedHashSet interface
        HashSet<String> hs = new HashSet<>();
        System.out.println(hs);

        hs.add("Ismail");
        hs.add("Mansuma");
        hs.add("Anna");
        hs.add("Melek");

        System.out.println(hs); //[Melek, Ismail, Mansuma, Anna] no order
        //Can not accept duplicate element

        HashSet<Integer> lhs = new LinkedHashSet<>();
        System.out.println(hs);

        lhs.add(15);
        lhs.add(17);
        lhs.add(7);
        lhs.add(9);
        lhs.add(null);

        System.out.println(lhs); //[15, 17, 7, 9, null]

        HashSet<Integer> lhs2 = new LinkedHashSet<>();
        System.out.println(hs);

        lhs2.add(15);
        lhs2.add(17);
        lhs2.add(75);
        lhs2.add(99);
        lhs2.add(null);

        //retainAll() is used to find intersection of two sets (common elements)
        lhs.retainAll(lhs2);  //left side will be modifed for commen elemnents
        System.out.println(lhs);  //[15, 17, null]

        //TreeSet

        TreeSet< Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('H');
        ts.add('K');
        ts.add('R');

        //treeSet does not accept null
        System.out.println(ts);  //[A, G, H, K, R, Z]

        //subSet() is used to create a new set contains within a certain range

        //TreeSet<Character> ss = ts.subSet('G', 'R');  //gives error because it must be come from SortedSet interface
        SortedSet<Character> ss = ts.subSet('G', 'R');
        //              First parameter included -  second parameter does not included
        System.out.println(ss);


        //note Set can be created Set<String> str = Set.of("A", "B", "C") metod





    }
}
