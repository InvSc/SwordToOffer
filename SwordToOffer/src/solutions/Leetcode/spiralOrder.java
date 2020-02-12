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
        if (matrix.length == 0) {
            return res;
        }
        int height1 = 0;
        int width1 = 0;
        int height2 = matrix.length;
        int width2 = matrix[0].length;
        while (true) {
            res.addAll(easyOrder(matrix, height1, height2, width1, width2));
            height1++;
            width1++;
            height2--;
            width2--;
            if (height1 >= height2 || width1 >= width2) break;
        }
        return res;
    }

    public List<Integer> easyOrder(int[][] matrix, int height1, int height2, int width1, int width2) {
        List<Integer> res = new ArrayList<>();
        int i, j; // i为行号, j为列号
        // 保存上边框的数字
        i = height1;
        for (j = width1; j < width2; j++) {
            res.add(matrix[i][j]);
        }
        // 保存右边框的数字
        j = width2 - 1;
        for (i = height1 + 1; i < height2; i++) {
            res.add(matrix[i][j]);
        }
        // 保存下边框的数字
        i = height2 - 1;
        if (i != height1) {
            for (j = width2 - 2; j > width1 - 1; j--) {
                res.add(matrix[i][j]);
            }
        }
        // 保存左边框的数字
        j = width1;
        if (j != width2 - 1) {
            for (i = height2 - 2; i > height1; i--) {
                res.add(matrix[i][j]);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] matrix2 = {{1}};
        int[][] matrix3 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        int[][] matrix4 = {
                {1},
                {2}
        };
        System.out.println(solution.spiralOrder(matrix));
    }
}