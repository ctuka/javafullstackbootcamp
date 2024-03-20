package d20arrays_arraylist;

public class ArrayList05 {


        public static int removeDuplicates(int[] nums) {
            if (nums.length <= 2) {
                return nums.length;
            }

            int index = 2; // Start from the third element
            for (int i = 2; i < nums.length; i++) {
                // Check if the current element is different from the two elements before it
                //      4  2            1 1
                if (nums[i] != nums[index - 2]) {
                    //2    1          1
                    nums[index++] = nums[i];
                }
            }

            return index;
        }

        public static void main(String[] args) {
            // Example usage
            int[] nums = {0,1, 1, 1, 2, 2, 3};
            int[] expectedNums = {0,1, 1, 2, 2, 3}; // Expected answer with correct length

            int k = removeDuplicates(nums);

            assert k == expectedNums.length;
            for (int i = 0; i < k; i++) {
                assert nums[i] == expectedNums[i];
            }

            System.out.println("Test passed!");
        }
    }


