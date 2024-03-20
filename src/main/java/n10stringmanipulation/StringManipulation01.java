package n10stringmanipulation;

public class StringManipulation01 {
    public static void main(String[] args) {
        String str  = "Java is easy";
        int numOfChars = str.length();
        System.out.println("numofCahrs = " + numOfChars);


        //example 5: Check the given world starts with "Java"
        if (str.startsWith("Java"))
        {
            System.out.println("It start with Java");
        } else
            System.out.println("It dose not strat with \"Java\"");

        //Example 6 Check the given string if "is" substring starts from index 5
        boolean isStartsWithIs = str.startsWith("is", 5);
        System.out.println("isStaertWithFive = " + isStartsWithIs );

        //Exaple 7: Check the given world ends with "easy"
        boolean endsWithEasy = str.endsWith("easy");
        System.out.println("endsWithEasy = " + endsWithEasy );
    }
}
