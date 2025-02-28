package Generics;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println(list.get(1));
        list.set(1, "Durian");
        System.out.println(list.get(1));
        list.remove(0);
        System.out.println("리스트 크기: " + list.size());
        System.out.println("리스트가 비었는가 " + list.isEmpty());
    }
}
