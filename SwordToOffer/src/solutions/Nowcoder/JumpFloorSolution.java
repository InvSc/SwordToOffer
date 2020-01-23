package solutions.Nowcoder;

public class JumpFloorSolution {
  public int JumpFloor(int target) {
      if(target == 1) {
          return 1;
      }
      if(target == 2) {
          return 2;
      }
      if(target > 2) {
          return JumpFloor(target-2) + JumpFloor(target-1);
      }
      return -1;
  }

  public static void main(String[] args) {
      JumpFloorSolution jumpFloorSolution = new JumpFloorSolution();
      System.out.println(jumpFloorSolution.JumpFloor(3));
  }
}
