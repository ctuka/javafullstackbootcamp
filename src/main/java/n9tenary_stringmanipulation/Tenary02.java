package n9tenary_stringmanipulation;

import java.util.Scanner;

public class Tenary02 {

    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        a = input.nextInt();
        Object result = a > 99 || a < 1000 ? " 3 Digit Number " : "Not 3 Digit Number";
    }
}
