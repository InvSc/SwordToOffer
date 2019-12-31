/**
 * 题目描述
 * 输入一个链表，输出该链表中倒数第k个结点。
 */

public class FindKthToTailSolution {
:::::


  :QueueImplement:QueueImplement:QueueImplement
  public class ListNode {
      int val;
      ListNode next = null;
      ListNode(int val) {
          this.val = val;
      }
  }
  public ListNode FindKthToTail(ListNode head,int k) {
    ListNode currentNode = head;
    int distance = 0;
    if (currentNode.next != null) {
      currentNode = currentNode.next;

    }
    return head;
  }
}
