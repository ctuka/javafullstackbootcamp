package n9tenary_stringmanipulation;

import java.util.Scanner;

public class Tenary01 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        a =input.nextInt();
        System.out.println("Enter b:");
        b =input.nextInt();
         Object result =  (a> 0 && b > 0 ) || (a<0 &&b <0) ? a * b : "I cannot multiply the differennt numbers ";
        System.out.println(result);
    }

}
