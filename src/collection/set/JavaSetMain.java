package collection.set;

import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        run(new HashSet<>()); //순서 보장 안함
        run(new LinkedHashSet<>()); //순서 보장
        run(new TreeSet<>()); //데이터 값 기준 정렬
    }

    public static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());
        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
        System.out.println();
    }
}
