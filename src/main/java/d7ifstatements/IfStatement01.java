package d7ifstatements;




import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number ....");
        int num = input.nextInt();

        if (num % 2  == 0)
            System.out.println("The number you entered is even");
        if(num % 2 != 0)
            System.out.println("The number you entered is odd");

    }

}
