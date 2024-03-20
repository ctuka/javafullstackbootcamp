package d5scanners_incrementdecrement;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number , firstTwo, lastTwo, total;
        System.out.println("Enter 5 digit number ");
        number = input.nextInt();
        firstTwo = number /1000;
        lastTwo = number % 100  ;
        total = firstTwo + lastTwo;
        System.out.println("result = " + total);
    }
}
