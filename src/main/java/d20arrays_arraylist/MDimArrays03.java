package d20arrays_arraylist;

import java.util.Random;

public class MDimArrays03 {
    public static void main(String[] args) {
        Random rd = new Random();
        int len1, len2, min ,max;
        len1 = 10;
        len2 = 5;

        int [][] mdArray = new int[len1][len2];
        for (int i = 0; i < mdArray.length ; i ++)
        {
            for (int k = 0 ; k < mdArray[i].length; k ++)
            {
                mdArray[i][k] = rd.nextInt(0,100);
            }
        }
        min   = mdArray[0][0];
        max   = mdArray[0][0];
        for (int [] ar1 : mdArray)
        {
            for (int ar2 : ar1)
            {
                min = Math.min(ar2, min);
                max = Math.max(ar2, max);
                System.out.println(" Number  = "  + ar2);
            }
        }
        int total = min + max;
        System.out.println("Min = " + min + " + " + "Max = " + max + " Total = " + total);


    }
}
