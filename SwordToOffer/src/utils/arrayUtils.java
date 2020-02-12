package utils;

import java.util.ArrayList;
//  废弃，因为我不想整一顿工具类在我提交的代码里面
public class arrayUtils {
    public int getIntFromArrayList(ArrayList arrayList, int index) {
        return Integer.parseInt(arrayList.get(index).toString());
    }
}
