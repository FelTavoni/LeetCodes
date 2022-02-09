import java.util.Arrays;

class Solution {
    public static int findPairs(int[] nums, int k) {
        int i = 0, j = 1, diff = 0;
        Arrays.sort(nums);

        // Iterating over the array.
        while (j < nums.length) {
            // Increment 'j' to avoid duplicates.
            while (j < nums.length - 1 && nums[j] == nums[j + 1]) {
                j++;
            }
            // If matches the k pair, advance both. Otherwise, increments only one pointer.
            if (Math.abs(nums[i] - nums[j]) == k) {
                diff++;
                i++;
                j++;
            } else if (Math.abs(nums[i] - nums[j]) < k) {
                j++;
            } else {
                i++;
            }

            // Constraints define that it has to be "<", not "<=".
            if (i == j) {
                j++;
            }
        }

        return diff;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,1,4,1,5};
        System.out.println(findPairs(array, 2));
    }
}