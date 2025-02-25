package middle1.lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello";
        String b = " java";

        //문자열 결합은 concat 사용
        String result1 = a.concat(b); //문자열 결합함수
        String result2 = (a + b); //참조값 끼리는 연산 안됨

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
