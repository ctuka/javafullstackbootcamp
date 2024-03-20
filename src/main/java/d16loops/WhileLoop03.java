package d16loops;

public class WhileLoop03 {
    public static void main(String[] args) {
        int x  = 313;
        String xStr = String.valueOf(x);
        String reversed =  "";
        int i = xStr.length() - 1;
        while (i >=0) {
            reversed = reversed + xStr.charAt(i);
            i--;
        }
        System.out.println("reveersed = " + reversed);
    }

}
