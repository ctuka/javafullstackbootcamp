package n10stringmanipulation;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StringManipulation02 {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2);
        //If I say, remove all digits or remove all letters or remove all symbols.....
        // we need to define a group of data
        //This defining group of data is Regular Expression in Java
        // We name it "REGEX" in short...

/*
                Most common REGEX:

        1) All digits ==> [0-9]
        2) All lowercase letters ==> [a-z]
        3) All uppercase letters ==> [A-Z]
        4) All the letters ==> [a-zA-Z]
        5) All the letters and digits ==> [a-zA-Z0-9]
        6) All punctuations ==> \\p{Punct}
        7) All the vowel ==> [aeiouAEIOU]
            All a, x, y letters ==> [axy]
            All the letters from a to g and A to G ==> [A-Ga-g]

       Note: to exclude statement we can use "^" sign.... It means "other than" or "except"

       8) All the characters other than lower cases ==> [^a-z]
       9) All the characters other than letters [^a-zA-Z]
       10) ALl the characters other than digits [0-9]

 */
        Scanner input = new Scanner(System.in);
        String s1 = "Learn Java eant 12345 dollars";
        String credidCart = "9334 8487 6358 9764";
        String cardWithStars = credidCart.replaceAll("[^0-9]", "");
        System.out.println(credidCart);
        System.out.println(cardWithStars);
        System.out.println(s1.replaceAll("[0-9]", "?"));
        System.out.println(s1.replaceAll("[\\d]", "?"));  //\\d says found only digits
        double d = Double.parseDouble(cardWithStars );
        System.out.println(d);
        System.out.println("Enter a word");

        String letter = input.nextLine();
        String [] lettersArray= letter.split("");
        for (int i = 0; i < lettersArray.length; i ++) {
            if (s1.indexOf(letter) == s1.lastIndexOf(letter)) {

            }
        }
    }
}
