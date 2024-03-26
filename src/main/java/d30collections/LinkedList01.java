package d30collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("Mikail");
        myList.add("Goksen");
        myList.add("Tanya");
        myList.add("Sedat");
        myList.add("Ismail");
        myList.add("Maryam");
        myList.add("Ismail");
        myList.add("Talha");

        System.out.println(myList.pop());
        System.out.println(myList);



    }
}
