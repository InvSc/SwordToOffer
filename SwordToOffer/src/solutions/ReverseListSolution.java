package solutions;

import utils.ListNode;

import java.util.ArrayList;

/** Date:2019-12-30 输入一个链表，反转链表后，输出新链表的表头。 */
public class ReverseListSolution {
  public int getIntFromArrayList(ArrayList arrayList, int index) {
    return Integer.parseInt(arrayList.get(index).toString());
  }

  public ListNode ReverseList(ListNode head) {
    ArrayList arrayList = new ArrayList();
    ListNode currentNode = head;
    arrayList.add(currentNode.val);
    while (currentNode.next != null) {
      currentNode = currentNode.next;
      arrayList.add(currentNode.val);
    }
    ListNode newNode =
        new ListNode(getIntFromArrayList(arrayList, arrayList.size() - 1)); // 新建了链表用于插入
    ListNode newHead = newNode; // 储存了新链表的头节点用于返回
    for (int i = getIntFromArrayList(arrayList, arrayList.size() - 2); i > -1; i--) {
      newNode.next = new ListNode(getIntFromArrayList(arrayList, i));
      newNode = newNode.next;
    }
    return newHead;
  }

  public static void main(String[] args) {
    ListNode listNode = ListNode.initListNode();
    ReverseListSolution solution = new ReverseListSolution();
    ListNode.printListNode(solution.ReverseList(listNode));
  }
}
