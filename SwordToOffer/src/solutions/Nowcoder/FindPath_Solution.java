package solutions.Nowcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

/**
 * 输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意:
 * 在返回值的list中，数组长度大的数组靠前)
 */
public class FindPath_Solution {
  public static class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
      this.val = val;
    }
  }

  public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
    /**
     * DFS实现方法 1 首先将根节点放入stack中。 2 从stack中取出第一个节点，并检验它是否为目标。 如果找到目标，则结束搜寻并回传结果。
     * 否则将它某一个尚未检验过的直接子节点加入stack中。 3 重复步骤2。 4 如果不存在未检测过的直接子节点。 将上一级节点加入stack中。 重复步骤2。 5 重复步骤4。 6
     * 若stack为空，表示整张图都检查过了——亦即图中没有欲搜寻的目标。结束搜寻并回传“找不到目标”。
     */
    if (root == null) {
      return new ArrayList<ArrayList<Integer>>();
    }
    Stack<TreeNode> unvisited = new Stack<>();
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    if (root.left == null && root.right == null && root.val == target) {
      ArrayList<Integer> arr = new ArrayList<>();
      arr.add(root.val);
      result.add(arr);
      return result;
    }
    ArrayList<TreeNode> pathNode = new ArrayList<>();
//    ArrayList<Integer> pathVal = new ArrayList<>();
    int sum = 0;
    unvisited.push(root);
    while (!unvisited.empty()) {
      TreeNode currentNode = unvisited.pop();
      sum += currentNode.val;
      if (currentNode.right != null) {
        unvisited.push(currentNode.right);
      }
      if (currentNode.left != null) {
        unvisited.push(currentNode.left);
      }
      pathNode.add(currentNode); // 默认在尾部添加
      if (currentNode.left == null && currentNode.right == null) {
        ArrayList<Integer> pathInt = new ArrayList<>();
        if (sum == target) {
          for (TreeNode node : pathNode) {
            pathInt.add(node.val);
          }
          result.add(pathInt);
        }
        sum -= currentNode.val;
        pathNode.remove(pathNode.size() - 1);
        if (pathNode.get(pathNode.size() - 1).left != null
            && pathNode.get(pathNode.size() - 1).left == currentNode
            && pathNode.get(pathNode.size() - 1).right == null) {
          sum -= pathNode.get(pathNode.size() - 1).val;
          pathNode.remove(pathNode.size() - 1);
        }
        if (pathNode.get(pathNode.size() - 1).right != null
            && pathNode.get(pathNode.size() - 1).right == currentNode) {
          sum -= pathNode.get(pathNode.size() - 1).val;
          pathNode.remove(pathNode.size() - 1);
        }
      }
    }
    Collections.sort(
        result,
        new Comparator<ArrayList<Integer>>() {
          @Override
          public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
            if (o1.size() < o2.size()) {
              return 1;
            } else return -1;
          }
        });
    return result;
  }

  public static void main(String[] args) {
    TreeNode rootNode = new TreeNode(10);
    TreeNode currentNode = rootNode;
    currentNode.left = new TreeNode(5);
    currentNode.right = new TreeNode(12);
    currentNode = currentNode.left;
    currentNode.left = new TreeNode(4);
    currentNode.right = new TreeNode(7);
    System.out.println(FindPath(rootNode, 22));
  }
}
