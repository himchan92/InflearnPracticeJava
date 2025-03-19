package collection.array;

import java.util.ArrayList;
import java.util.List;

public class MyArrayListV4Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        String string = list.get(0);
        System.out.println("string = " + string);
    }
}
