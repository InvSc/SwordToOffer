package solutions;

import java.util.*;

/**
 * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意:
 * 在返回值的list中，数组长度大的数组靠前)
 */
public class PathSum_Solution {
  public static class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int x) {
      this.val = x;
    }
  }

  public static List<List<Integer>> pathSum(TreeNode root, int sum) {
    /**
     * DFS实现方法 1 首先将根节点放入stack中。 2 从stack中取出第一个节点，并检验它是否为目标。 如果找到目标，则结束搜寻并回传结果。
     * 否则将它某一个尚未检验过的直接子节点加入stack中。 3 重复步骤2。 4 如果不存在未检测过的直接子节点。 将上一级节点加入stack中。 重复步骤2。 5 重复步骤4。 6
     * 若stack为空，表示整张图都检查过了——亦即图中没有欲搜寻的目标。结束搜寻并回传“找不到目标”。
     */
    if (root == null) {
      List<List<Integer>> res = new ArrayList<>();
      return res;
    }
    Stack<TreeNode> unvisited = new Stack<>();
    List<List<Integer>> result = new ArrayList<>();
    if (root.left == null && root.right == null && root.val == sum) {
      List<Integer> arr = new ArrayList<>();
      arr.add(root.val);
      result.add(arr);
      return result;
    }
    List<TreeNode> pathNode = new ArrayList<>();
    //    List<Integer> pathVal = new List<>();
    int currentSum = 0;
    unvisited.push(root);
    while (!unvisited.empty()) {
      TreeNode currentNode = unvisited.pop();
      currentSum += currentNode.val;
      if (currentNode.right != null) {
        unvisited.push(currentNode.right);
      }
      if (currentNode.left != null) {
        unvisited.push(currentNode.left);
      }
      pathNode.add(currentNode); // 默认在尾部添加
      if (currentNode.left == null && currentNode.right == null) {
        List<Integer> pathInt = new ArrayList<>();
        if (currentSum == sum) {
          for (TreeNode node : pathNode) {
            pathInt.add(node.val);
          }
          result.add(pathInt);
        }
        currentSum -= currentNode.val;
        pathNode.remove(pathNode.size() - 1);
        if (!pathNode.isEmpty() && !unvisited.empty()) {
          while (!(pathNode.get(pathNode.size() - 1).right != null
              && pathNode.get(pathNode.size() - 1).right == unvisited.peek())){
                currentSum -= pathNode.get(pathNode.size() - 1).val;
                pathNode.remove(pathNode.size() - 1);
            }
        }


        //        if (pathNode.get(pathNode.size() - 1).left != null
        //            && pathNode.get(pathNode.size() - 1).left == currentNode
        //            && pathNode.get(pathNode.size() - 1).right == null) {
        //          currentSum -= pathNode.get(pathNode.size() - 1).val;
        //          pathNode.remove(pathNode.size() - 1);
        //        }
        //        if (pathNode.get(pathNode.size() - 1).right != null
        //            && pathNode.get(pathNode.size() - 1).right == currentNode) {
        //          currentSum -= pathNode.get(pathNode.size() - 1).val;
        //          pathNode.remove(pathNode.size() - 1);
        //        }
      }
    }
    Collections.sort(
        result,
        new Comparator<List<Integer>>() {
          @Override
          public int compare(List<Integer> o1, List<Integer> o2) {
            if (o1.size() < o2.size()) {
              return 1;
            } else return -1;
          }
        });
    return result;
  }

  public static void main(String[] args) {
    TreeNode rootNode = new TreeNode(5);
    TreeNode currentNode = rootNode;
    currentNode.left = new TreeNode(4);
    currentNode.right = new TreeNode(8);
    currentNode.right.left = new TreeNode(13);
    currentNode.right.right = new TreeNode(4);
    currentNode.right.right.left = new TreeNode(5);
    currentNode.right.right.right = new TreeNode(1);
    currentNode = currentNode.left;
    currentNode.left = new TreeNode(11);
    currentNode = currentNode.left;
    currentNode.left = new TreeNode(7);
    currentNode.right = new TreeNode(2);
    System.out.println(pathSum(rootNode, 22));
  }
}
