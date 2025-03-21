package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        studentMap.put("studentA", 100); //같은키에 put해서 값 교체 가능
        System.out.println(studentMap);

        boolean containskey = studentMap.containsKey("studentA"); //키 존재여부
        System.out.println("containsKey : " + containskey);

        //특정 값 삭제
        studentMap.remove("studentA");
        System.out.println("remove : " +studentMap);
    }
}
