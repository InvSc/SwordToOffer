package solutions;
import utils.ListNode;

import java.lang.reflect.Array;
import java.util.List;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class ReverseListSolution {
    public ListNode ReverseList(ListNode head) {
        int array [] = {};
        ListNode currentNode = head;
        array[array.length] = currentNode.val;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            array[array.length] = currentNode.val;
        }
        ListNode newNode = new ListNode(array[array.length-1]);
        for(int i=array.length-1; i>-1; i--) {
            newNode.next = new ListNode(array)
        }
        return null;
    }
}
