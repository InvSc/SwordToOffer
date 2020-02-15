package solutions.Nowcoder;

public class JumpFloorII_Solution {
    //递归解法
  public int JumpFloorII(int target) {
    if (target == 1) {
      return 1;
    }

    if (target > 1) {
      int num = 1;
      for (int i = 1; i < target; i++) {
        num += JumpFloorII(i);
      }
      return num;
    }
    return -1;
  }

  public static void main(String[] args) {
    JumpFloorII_Solution jumpFloorII_solution = new JumpFloorII_Solution();
    System.out.println(jumpFloorII_solution.JumpFloorII(3));
  }
}
