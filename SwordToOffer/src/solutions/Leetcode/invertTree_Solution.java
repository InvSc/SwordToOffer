package solutions.Leetcode;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
 * right; TreeNode(int x) { val = x; } }
 */
class invertTree_Solution {
  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

//  public TreeNode invertTree(TreeNode root) {
//      if (root == null) return null; // 递归出口
//      TreeNode right = root.right;
//      root.right = invertTree(root.left);
//      root.left = invertTree(right);
//      return root;
//  }

  public static void main(String[] args) {
    TreeNode node = new TreeNode(4);



  }
  public TreeNode invertTree(TreeNode left) {
    if (left == null) return null; // 递归出口
    TreeNode right = left.right;
    left.right = invertTree(left.left);
    left.left = invertTree(right);
    return left;
  }
}
