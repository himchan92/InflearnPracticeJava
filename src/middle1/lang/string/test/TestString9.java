package middle1.lang.string.test;

public class TestString9 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        for(String item : fruits.split(",")) {
            System.out.println(item);
        }

        //join 결합은 배열 변수 대상 요소들을 결합할 기준 설정
        System.out.println(String.join("->", fruits.split(",")));;
    }
}
