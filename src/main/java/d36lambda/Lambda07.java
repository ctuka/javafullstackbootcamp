package d36lambda;

import java.util.*;

public class Lambda07 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,3,4,5,11,10));

        findMinimum(nums);
     }

     public static void findMinimum(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce((t,u) -> t >u ? u: t).get();

         System.out.println("Minumum value = " + min);
     }

     //2.Sort the elements in reversed ordeer use(sorted(Comparator.reverseorder())
    public  static void findMinumum3(List<Integer> nums) {
        Optional<Integer> min = nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t,u) -> u);
        if (min.isPresent()){
            System.out.println(min.get());
        } else  {
            System.out.println("List is empty or value can not be found!");
        }
    }
}
