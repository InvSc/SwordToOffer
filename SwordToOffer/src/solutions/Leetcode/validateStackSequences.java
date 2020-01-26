package solutions.Leetcode;

import java.util.Stack;

/**
 * LeetCode946
 * https://leetcode-cn.com/problems/validate-stack-sequences/submissions/
 * Created in 2020-01-25
 */

/**
 * 一次过，意外！！
 */
class valStackSeqSolution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length == 0 && popped.length == 0) {
            return true;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int i = 0, j = 0;
        while (i < pushed.length && j < popped.length) {
            // 进行入栈操作直到遇到可以出栈的数字
            while ((stack.empty() || stack.peek() != popped[j]) && i < pushed.length) {
                stack.push(pushed[i]);
                i++;
            }
            // 只要满足数字对应相等，持续进行出栈操作
            while (!stack.empty() && stack.peek() == popped[j] && j < popped.length) {
                stack.pop();
                j++;
            }
            // 这里注意特殊情况，实测无用，可注释
//            if (stack.empty() && i == pushed.length && j < popped.length) {
//                return false;
//            }
        }
        if (stack.empty()) {
            return true;
        }else return false;
    }

    public static void main(String[] args) {
        valStackSeqSolution solution = new valStackSeqSolution();
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,3,5,1,2};
        System.out.println(solution.validateStackSequences(pushed, popped));
    }
}