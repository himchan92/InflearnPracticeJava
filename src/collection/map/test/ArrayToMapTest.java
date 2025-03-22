package collection.map.test;

import java.util.HashMap;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {
            {"java", "10000"},
            {"Spring", "20000"},
            {"JPA", "30000"}
        };

        HashMap<String, Integer> map = new HashMap<>();
        for(String[] product : productArr) {
            String key = product[0]; //키
            String value = product[1]; //값
            map.put(key, Integer.valueOf(value));
        }

        //모든 데이터 출력
        for(String result : map.keySet()) {
            System.out.println("제품 : " + result + ", 가격 : " + map.get(result));
        }
    }
}
