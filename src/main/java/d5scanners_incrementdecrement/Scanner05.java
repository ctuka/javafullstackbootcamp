package d5scanners_incrementdecrement;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        float area, perimeter ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Length");
        float length = input.nextFloat();
        System.out.println("Enter with");
        float with = input.nextFloat();
        area = length * with;
        perimeter = 2 * ( length + with);
        System.out.printf("Area of Rectangular = %.2f, Perimeter of Rectangular = %.2f ", area, perimeter);


    }
}
