package solutions.Leetcode;

import java.util.*;

/**
 * LeetCode 155
 * https://leetcode-cn.com/problems/min-stack/
 * 思路：
 * 起初想通过继承来解决基本的实现(class MinStack extends Stack),经过参阅参考答案，知道添加辅助数据结构实现即可，空间换时间
 * 然后效率很差
 * 执行结果：通过
 * 显示详情
 *  执行用时 :67 ms, 在所有 Java 提交中击败了16.92%的用户
 *  内存消耗 :49.7 MB, 在所有 Java 提交中击败了7.91%的用户
 */
class MinStack {

    Stack stack = new Stack<Integer>();
    ArrayList helper = new ArrayList<Integer>();
    Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 > o2) {
                return 1;
            } else if (o1 < o2) {
                return -1;
            }
            return 0;
        }
    };
    /**
     * initialize your data structure here.
     */
    public MinStack() {
    }

    public void push(int x) {
        stack.push(x);
        helper.add(x);
        Collections.sort(helper, comparator);
    }

    public void pop() {
        helper.remove(stack.peek());
        Collections.sort(helper, comparator);
        stack.pop();
    }

    public int top() {
        return (int) stack.peek();
    }

    public int getMin() {
        if (helper.size() == 0) {
            return -1;
        }
        return (int) helper.get(0);
    }

//    public static void main(String[] args) {
//        MinStack minStack = new MinStack();
//        minStack.push(-2);
//        minStack.push(0);
//        minStack.push(-3);
//        System.out.println(minStack.getMin());
//        minStack.pop();
//        System.out.println(minStack.top());
//        System.out.println(minStack.getMin());
//    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

