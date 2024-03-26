package d30collections;

import java.util.Scanner;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {
        //Strore student email address in natural order
        //email are unique. let use a set.Which structure should be use?

        TreeSet<String> email = new TreeSet<>();
        email.add("tkoseli@hotmail.com");
        email.add("email@email.com");
        email.add("something@mail.com");
        email.add("k@hotmail.com");

        System.out.println(email);


    }
}
