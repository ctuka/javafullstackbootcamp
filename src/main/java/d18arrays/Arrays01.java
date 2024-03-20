package d18arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int [] array = {4,3,6,2,8,4,9};
        int max= array[0];
        int min = array[0];
        int total = 0;

        for (int i =1 ; i < array.length; i++) {
            if (min  > array[i] )
            {
                min = array[i];
            }
            if(max < array[i])
            {
                max = array[i];
            }


        }
        total = min + max;
        System.out.println("Total = " + total);
    }
}
