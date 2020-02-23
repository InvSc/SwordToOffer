package solutions.Leetcode;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
 */
class getLeastNumbersSolution {
    public static int[] getLeastNumbers(int[] arr, int k) {
        if (arr.length == 0) {
            int[] newArr = {};
            return newArr;
        }
        // Sorting algorithm.
//        for (int i = 1; i < arr.length; i++) {
//            int j = i;
//            int l = i - 1;
//            while (l >= 0 && arr[j] < arr[l]) {
//                int temp = arr[j];
//                arr[j] = arr[l];
//                arr[l] = temp;
//                j--;
//                l--;
//            }
//        }
        Arrays.sort(arr);
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] test = {4, 5, 1, 6, 2, 7, 3, 8};
        System.out.println(Arrays.toString(getLeastNumbers(test, 4)));
    }
}