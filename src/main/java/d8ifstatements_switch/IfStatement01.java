package d8ifstatements_switch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Tell me your age to see phase!");
        int age = input.nextInt();

        if (age <0) {
            System.out.println("Invalid age");
        } else if (age <5) {
            System.out.println("Infant");
        } else if (age <13 ) {
            System.out.println("Child");
        } else if (age < 21) {
            System.out.println("Teen");
        } else if (age < 41) {
            System.out.println("Adult");
        } else  {
            System.out.println("Old");
        }
    }


}
