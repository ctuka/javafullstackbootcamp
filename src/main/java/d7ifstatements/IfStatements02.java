package d7ifstatements;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter e number for week of the day");
        int number =  input.nextInt();
        while (number >7 || number <1) {
            System.out.println("You must enter number between 1-7");
            number = input.nextInt();
        }
         if (number == 1)
            System.out.println("Monday");
        else if (number == 2)
            System.out.println("Tuesday");
        else if (number == 3)
            System.out.println("Wednesday");
        else if (number == 4)
            System.out.println("Thursday");
        else if (number == 5)
            System.out.println("Friday");
        else if (number == 6)
            System.out.println("Saturday");
        else
            System.out.println("Sunday");
    }
}
