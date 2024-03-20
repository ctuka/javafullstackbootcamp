package n14loops;

public class ForLoops {
    public static void main(String[] args) {
        String m = "Miami";

        for( int i = 0; i < m.lastIndexOf("m"); i++)
            System.out.print(m.charAt(i));


        //Print  only nonoccuring chareters to the console
        String s  ="loops";
        String uniqueChars = "";
        for (int i = 0; i < s.length(); i ++) {
            char ch = s.charAt(i);
            if (s.indexOf(ch)  == s.lastIndexOf(ch))
            uniqueChars = uniqueChars + ch;



        }
        System.out.println();
        System.out.println(uniqueChars);
    }

}
