package d5scanners_incrementdecrement.d32maps_exceptions;

public class Exceptions04 {
    public static void main(String[] args) {
        //4) ArrayIndexOutofBondException

        String [] arr = {"j", "a", "t", "b"};
        try {
            getElemenFromArray(arr, 5);
        }
        catch (IndexOutOfBoundsException exception) {
            System.out.println(exception.getMessage());
        }

    }

    public static void getElemenFromArray ( String[] s, int idx)
    {
        String elm = s[idx];
        System.out.println(elm);
    }
}
