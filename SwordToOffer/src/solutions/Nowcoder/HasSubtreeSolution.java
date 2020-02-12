package solutions.Nowcoder;

/**
 * public class TreeNode { int val = 0; TreeNode left = null; TreeNode right = null;
 *
 * <p>public TreeNode(int val) { this.val = val; } }
 */
public class HasSubtreeSolution {

  public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
      this.val = val;
    }
  }
  // 虽然是做过的题，原题是判断镜像，但还是经过查找资料得知使用递归思想
  public boolean HasSubtree(TreeNode root1, TreeNode root2) {
    if (root2 == null || root1 == null) {
      return false;
    }
    boolean result;
    result = false;
    if (root1.val == root2.val) {
      result = IsSubTree(root1, root2);
    }
    if (!result) {
      result = IsSubTree(root1.left, root2);
    }
    if (!result) {
      result = IsSubTree(root1.right, root2);
    }
    return result;
  }

  private boolean IsSubTree(TreeNode root1, TreeNode root2) {
    if (root2 == null) {
      return true;
    }
    if (root1 == null) {
      return false;
    }
    if (root1.val != root2.val) {
      return false;
    }
    return IsSubTree(root1.left, root2.left) && IsSubTree(root1.right, root2.right);
  }
}
