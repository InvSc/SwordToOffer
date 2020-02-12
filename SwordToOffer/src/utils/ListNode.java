package utils;

/**
 * 链表工具类 - val - next - ListNode initListNode() 用于初始化一个从0到10的链表 - void printListNode(ListNode
 * listNode) 顺序遍历打印链表中每个元素
 */
public class ListNode {
  public int val;
  public ListNode next = null;

  public ListNode(int val) {
    this.val = val;
  }

  public static ListNode initListNode() {
    ListNode listNode = new ListNode(1);
    ListNode currentNode = listNode;
    for (int i = 2; i < 6; i++) {
      currentNode.next = new ListNode(i);
      currentNode = currentNode.next;
    }
    return listNode;
  }

  public static void printListNode(ListNode listNode) {
    if (listNode == null) {
      System.out.println("This is an empty linked list.");
    }
    ListNode currentNode = listNode;
    System.out.println(currentNode.val);
    while (currentNode.next != null) {
      currentNode = currentNode.next;
      System.out.println(currentNode.val);
    }
  }
}
