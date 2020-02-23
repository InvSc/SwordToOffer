package solutions.Leetcode;
/**
 * https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 * code below reference from leetcode
 */

class maxSubArraySolution {
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for (int num: nums) {
            // sum represents max sum of the son list end with num[i]代表以nums[i] 结尾的子数组最大和
            sum = Math.max(sum + num, num);
            // ans 是所有sum 的最大值，即答案
            ans = Math.max(sum, ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}