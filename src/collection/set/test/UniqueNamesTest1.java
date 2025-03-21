package collection.set.test;

import java.util.*;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> refresh = new HashSet<>();
        Set<Integer> array = new LinkedHashSet<>();
        for(Integer num : inputArr) {
            refresh.add(num);
            array.add(num);
        }

        System.out.println(refresh);
        System.out.println(array);

        //배열 -> List화
        List<Integer> list = Arrays.asList(1,1,2,3);
        List<Integer> list2 = List.of(1,3,3,4);
        System.out.println(list);
        System.out.println(list2);
    }
}