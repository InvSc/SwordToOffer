package solutions.Leetcode;

/**
 * LeetCode 138. 复制带随机指针的链表
 * https://leetcode-cn.com/problems/copy-list-with-random-pointer/
 */

import javax.xml.soap.Node;

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
        Node oldNode = head;
        Node newNode = new Node(oldNode.val);
        while (oldNode.next != null) {
            oldNode = oldNode.next;
            newNode.next = new Node(oldNode.val);
            newNode = newNode.next;
        }
        return newNode;
    }
}

