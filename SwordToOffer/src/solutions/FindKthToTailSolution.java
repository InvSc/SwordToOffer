package solutions;

/**
 * Date：2019-12-29
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 */

public class FindKthToTailSolution {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

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

    public ListNode initListNode () {
        ListNode listNode = new ListNode(0);
        ListNode currentNode = listNode;
        for (int i=1; i<11; i++) {
            currentNode.next = new ListNode(i);
            currentNode = currentNode.next;
        }
        return listNode;
    }

    public void printListNode (ListNode listNode) {
        ListNode currentNode = listNode;
        System.out.println(currentNode.val);
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.println(currentNode.val);
        }
    }

    public static void main(String[] args) {
        FindKthToTailSolution Solution = new FindKthToTailSolution();
        ListNode listNode = Solution.initListNode();
        Solution.printListNode(Solution.FindKthToTail(listNode, 1));

    }
}
