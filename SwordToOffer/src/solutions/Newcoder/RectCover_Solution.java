package solutions.Newcoder;

public class RectCover_Solution {
  public int RectCover(int target) {
    //        if (target == 0) {
    //            return 0;
    //        }

    if (target == 1) {
      return 1;
    }
    if (target == 2) {
      return 2;
    }
    if (target > 2) {
      return RectCover(target - 1) + RectCover(target - 2);
    }
    //题目要求RectCover(0)=0也是醉了
    return 0;
  }

  public static void main(String[] args) {
    //
    RectCover_Solution rectCover_solution = new RectCover_Solution();
    System.out.println(rectCover_solution.RectCover(4));
  }
}
