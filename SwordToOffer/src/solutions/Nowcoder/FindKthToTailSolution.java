package solutions.Nowcoder;

import utils.ListNode;

/**
 * Date：2019-12-29
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 */

public class FindKthToTailSolution {
    public ListNode FindKthToTail(ListNode head, int k) {
        // 注意边界条件
        if (head == null) {
            return null;
        }
        ListNode currentNode = head;
        ListNode lastNode = head;
        int length = 1; // 链表的长度
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            length += 1;
        }
        currentNode = head;
        if (length < k) {
            return null;
        }
        if (length == k) {
            return currentNode;
        }
        for (int i=0; i<length-k; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }



    public static void main(String[] args) {
        FindKthToTailSolution Solution = new FindKthToTailSolution();
        ListNode listNode = ListNode.initListNode();
        ListNode.printListNode(Solution.FindKthToTail(listNode, 1));

    }
}
