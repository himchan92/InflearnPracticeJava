package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //추가
        studentMap.put("studentA", 50);
        System.out.println(studentMap);

        //학생 없는경우 추가
        if(!studentMap.containsKey("studentA")) {
            studentMap.put("studentA", 100);
        }
        System.out.println(studentMap);

        //학생없는경우 추가 함수 사용 -> putIfAbsent : 해당 키값 있는경우 put 수행
        studentMap.putIfAbsent("studentA", 100); //있으니 그대로 50
        studentMap.putIfAbsent("studentB", 100); //없으니 100 추가
        System.out.println(studentMap);
    }
}
