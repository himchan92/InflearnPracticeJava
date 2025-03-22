package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);

        Map<String, Integer> common = new HashMap<>();
        common.put("B", Integer.valueOf(map1.get("B")) + Integer.valueOf(map2.get("B")));
        common.put("C", Integer.valueOf(map1.get("C")) + Integer.valueOf(map2.get("C")));

        System.out.println(common);
    }
}
