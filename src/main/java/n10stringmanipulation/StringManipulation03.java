package n10stringmanipulation;

import java.util.Scanner;

public class StringManipulation03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        /*if (password.length() < 8 ) {
            System.out.println("Your password must contain 8 characters");
        } else if (password.matches("[ ]")) {
            System.out.println("Your password can not contain space character");
        } else if (!password.matches("[A-Z]")) {
            System.out.println("Your password must contain least 1 upper case");
        }  else if(!password.matches("[a-z]")) {
            System.out.println("Your password must contain at least 1 lower case caracter");
        } else if (!password.matches("[0-9]"))
            System.out.println("Your password must contain at least 1 digit ");
          else {
            System.out.println("Your password is valid");
        }*/
                                                          //En az 1 kucuk harf en az
                                                                       //1 buyuk harf
                                                                                   // enaz 1 rakam en ve
                                                                                            // hic bosluk olmamali
        if (password.length() > 7 && password.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)^(?!.*\\s).*$"))
            System.out.println("Your password is valid");
        else
            System.out.println("Your password is not valid");
        //i)must contin at least 8 characters
        boolean lengthControl = password.length() >= 8;

        //ii)must not contion space characters
        boolean spaceCheck = password.replaceAll("[^ ]", "").isEmpty();
        //boolean spaceCheck = password.replaceAll("[^ ]", "").length() == 0;

        //iii) must contain at least one uppercase
        boolean upperCaseCheck = password.replaceAll("[^A-Z]", "").length() > 0;

        //iv) must contain at least one lover case
        boolean loverCaseCheck = password.replaceAll("[^a-z]", "").length() > 0;

        //v) must contain at least one digit
        boolean digitCheck = password.replaceAll("[^0-9]", "").length() > 0;

        boolean isValid = lengthControl && spaceCheck && upperCaseCheck && loverCaseCheck && digitCheck;

        if (isValid) {
            System.out.println("Paswoord is valid");
        } else {
            System.out.println("Invaliid Password");
        }
    }
}
