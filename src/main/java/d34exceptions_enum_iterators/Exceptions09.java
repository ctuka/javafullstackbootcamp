package d34exceptions_enum_iterators;

import java.io.FileInputStream;
import java.io.IOException;

public class Exceptions09 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/wingchun/Desktop/tefo.txt");
            int k = 0;
            while ((k = fis.read()) != -1 ) {
                System.out.println((char) k);
            }
        } catch (IOException ioe)
        {
            System.out.println(ioe.getMessage());
        }
    }
}
