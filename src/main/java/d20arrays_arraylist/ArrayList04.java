package d20arrays_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList04 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(23);
        myList.add(10);
        myList.add(19);
        System.out.println(myList);
        myList.sort(null);
        System.out.println(myList);
        int  []  a = new int[5];
        a[0] = 1;
        a[2] = 5;
        a[1] = 7;
        a[3] = 2;
        a[4] = 9;
        Arrays.stream(a).sorted();
        System.out.println(Arrays.toString(Arrays.stream(a).toArray()));
    }

}

























































