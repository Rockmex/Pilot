package CoreJava.Java8;

import java.util.List;

public class MyStream {
    @FunctionalInterface
    interface Interface{
        public  <T> T MyMap(List<T> list);
    }
}
