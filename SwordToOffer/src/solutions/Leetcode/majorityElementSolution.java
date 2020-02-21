package solutions.Leetcode;
import java.lang.Math;

class majorityElementSolution {
    public static int majorityElementSolution(int[] nums) {
        if (nums == null) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            int j = i;
            int k = i - 1;
            while (k >= 0 && nums[j] < nums[k]) {
                int temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                j--;
                k--;
            }
        }
        return nums[(int) Math.floor(nums.length/2)];
    }

    public static void main(String[] args) {
        int[] example = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(majorityElementSolution(example));
    }
}