package solutions.Nowcoder;

import java.util.Arrays;

/** 题目描述
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * */
public class ReOrderArray {
  public void reOrderArray(int [] array) {
    int lastOddIndex = -1; // 上一个奇数的下标
    int firstOddIndex = -1; // 第一个奇数的下标
    int temp = -1; //临时变量
    for(int i=0; i<array.length; i++) {
      if (!ParityJudgment(array[i])) {
        firstOddIndex = i;
        break;
      }
    }
    if (firstOddIndex==-1) { // 这说明全是偶数，不需要进行排序处理
      return;
    }
    // 补充处理，找到第一个奇数之后把它置于数组头部
    for(int i=0; i<firstOddIndex; i++) {
      temp = array[i];
      array[i] = array[firstOddIndex];
      array[firstOddIndex] = temp;
    }
    firstOddIndex = 0;
    lastOddIndex = firstOddIndex;

    for(int i=firstOddIndex+1; i<array.length; i++) {
      if (!ParityJudgment(array[i])) { // 如果当前是奇数，那么执行下面操作
        lastOddIndex++;
        for(int j=lastOddIndex; j<i; j++){
          temp = array[j];
          array[j] = array[i];
          array[i] = temp;
        }
      }
    }
    return;
  }
//  判断奇偶性
  public boolean ParityJudgment(int number) {
    if(number%2 == 0){
      return true; //若为偶数则返回true
    }
    else return false;
  }

  public static void main(String[] args) {
    int array[] = {2, 4, 6, 8, 1, 3, 5, 7};
    ReOrderArray reOrderArray = new ReOrderArray();
    reOrderArray.reOrderArray(array);
    System.out.println(Arrays.toString(array));
  }
}
