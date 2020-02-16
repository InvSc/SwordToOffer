package solutions.Leetcode;

/**
 * LeetCode 138. 复制带随机指针的链表
 * https://leetcode-cn.com/problems/copy-list-with-random-pointer/
 */
/**
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class NodeCopyRandomListSolution {
    // Definition for a Node.
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        // 首先考虑没有随机指针的结构
        Node newHead = new Node(head.val); // 新的节点头
        // 依次遍历原链表的每个节点
        Node newNode = newHead; // 用于遍历的新节点
        Node oldNode = head; // 用于遍历的原节点
        while (oldNode.next != null) {
            oldNode = oldNode.next;
            newNode.next = new Node(oldNode.val);
            newNode = newNode.next;
        }
        // 添加随机指针
        oldNode = head; // 用于遍历的原节点
        newNode = newHead; // 用于遍历的新节点
        if (oldNode.random != null) {
            int index = 0; // 待求的random值
            Node currentNode = head;
            while (currentNode.next != null) {
                index++;
            }
        }
        while (oldNode.next != null) {
            oldNode = oldNode.next;
            newNode.next = new Node(oldNode.val);
            newNode = newNode.next;
        }
        return newHead;
    }
    // For a specific Node node, only when it is not null,
    // compute its Index in a List.
    public int computeIndex(Node listHead, Node node) {
        Node node1 = listHead; // 用于遍历的原节点
        int index = 0; // 待求的random值
        if (node1 == node)
        while (node1.next != node) {
            node1 = node1.next;

        }
        return index;
    }
}

