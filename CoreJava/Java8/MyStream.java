package CoreJava.Java8;

import java.util.ArrayList;
import java.util.List;

public class MyStream {
    @FunctionalInterface
    interface Interface{
        public int operate(int i);
    }

    public static List<Integer> MyMap(ArrayList<Integer> list, Interface stream) {
        List<Integer> retList = new ArrayList<>();
        for (int i : list) {
            retList.add(stream.operate(i));
        }
        return retList;
    }
}
