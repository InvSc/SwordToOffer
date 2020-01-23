package solutions.Leetcode;


import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode54 螺旋矩阵
 * https://leetcode-cn.com/problems/spiral-matrix/
 */

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int height = matrix.length;
        int width = matrix[0].length;
        for ()
        return res;
    }

    public List<Integer> easyOrder(int[][] matrix, int height, int width) {
        List<Integer> res = new ArrayList<>();
        int i, j; // i为行号, j为列号
        // 保存上边框的数字
        i = 0;
        for (j = 0; j < matrix[0].length; j++) {
            res.add(matrix[i][j]);
        }
        // 保存右边框的数字
        j = matrix.length - 1;
        for (i = 1; i < matrix.length; i++) {
            res.add(matrix[i][j]);
        }
        // 保存下边框的数字
        i = matrix.length - 1;
        for (j = matrix[0].length - 2; j > -1; j--) {
            res.add(matrix[i][j]);
        }
        // 保存左边框的数字
        j = 0;
        for (i = matrix.length - 2; i > 0; i--) {
            res.add(matrix[i][j]);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(solution.easyOrder(matrix));
    }
}