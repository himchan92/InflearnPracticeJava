package Generics.quiz;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentListExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("김길벗");
        list.add("이코천");
        list.add("홍길동");

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        HashMap<String, Integer> params = new HashMap<>();
        params.put("홍길동", 85);
        params.put("김길벗", 92);
        params.put("이코천", 78);
        params.put("강남순", 90);

        for(String key : params.keySet()) {
            System.out.println(key + ", " + params.get(key));
        }
        System.out.println();

        if(params.containsKey("홍길동")) {
            System.out.println(params.get("홍길동"));
        }
    }
}
