package middle1.lang.string;

public class StringBasicMain {

    public static void main(String[] args) {
        // String : 참조형 변수, 객체 생성가능
        String str1 = "hello"; //자주 사용되어 new 안해도 내부적으로 생성
        String str2 = new String("hello");

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}