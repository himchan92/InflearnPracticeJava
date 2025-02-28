package Generics;

public class Main {

    public static void main(String[] args) {
        // 제네릭 사용전 타입 불일치로 오류 난다.
//        Box box = new Box();
//        box.setContent("Hello, World");
//        Integer number = (Integer)box.getContent();
//        System.out.println(number);

        // 제네릭 사용후 타입 안전성 보장으로 정상실행(T)
        // T는 모든타입 다허용하여 String 사용 가능
        Box<String> box = new Box<>();
        box.setContent("Hello, World");
        String content = box.getContent();
        System.out.println(content);
    }
}
