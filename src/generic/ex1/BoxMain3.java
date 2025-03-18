package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<>(); //생성시점에 T의 타입을 Integer 결정하여 타입 보장
        //integerBox.set("문자100"); //컴파일 시점 바로 오류체크로 타입보장
        integerBox.set(10); //형변환 할필요 없이 Integer 설정한 순간 결정됨

        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<>(); //String 설정
        stringBox.set("hello"); //컴파일 시점 다른 타입 입력 시 오류 체크로 오타 방지
        String str = stringBox.get();
        System.out.println("str = " + str);

        // 결론 : 제네릭은 생성 시점에 모든 타입을 지정가능하여 컴파일 시점에 오타 시 오류뱉어 타입보장, 형변환 안해도 됨
    }
}
