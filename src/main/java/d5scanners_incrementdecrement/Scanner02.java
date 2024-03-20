package d5scanners_incrementdecrement;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        String firstName;
        String lastName;
        int age;
        double height;
        int weight;
        String maritalStatus;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Name");
        firstName = input.nextLine();
        System.out.println("Enter Last Name");
        lastName =input.nextLine();
        System.out.println("Enter Age");
        age = (int) input.nextByte();
        System.out.println("Enter Height ");
        height =  input.nextDouble();
        System.out.println("Enter Weight");
        weight = (int) input.nextByte();
        System.out.println("Enter Marital Status");
        maritalStatus = input.next(); //next() method allows me to enter just one single word...

        System.out.printf( "First Name %s, Last NAme: %s, Age: %d, Height: %f, Weight: %d, Marital Status %s",firstName, lastName
                        ,age, height, weight, maritalStatus);


    }
}
