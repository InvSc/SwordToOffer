import java.util.ArrayList;
import java.util.Arrays;

public class RotatingArray {
    /*
    暴力解法338ms
     */
//    public int minNumberInRotateArray(int [] array) {
//        if(array.length == 0) {
//            return 0;
//        }
//        int min = array[0];
//
//        for(int i=0; i<array.length; i++) {
//            min = array[i] < min ? array[i] : min;
//        }
//        return min;
//    }
    //没有进步
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0) {
            return 0;
        }
        if(array.length == 1) {
            return array[0];
        }
        for(int i=0; i<array.length-1; i++) {
            if(array[i] > array[i+1]) {
                return array[i+1];
            }
        }
        return array[0];
    }

    public static void main(String[] args){
        int[] ints = {2, 2, 2, 3, 2, 2};
        RotatingArray rotatingArray = new RotatingArray();
        System.out.println(rotatingArray.minNumberInRotateArray(ints));
    }
}
