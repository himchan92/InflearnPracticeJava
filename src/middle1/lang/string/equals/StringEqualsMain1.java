package middle1.lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        // 주소값 달라 그냥 == 은 다름
        // 문자열 비교전용 Object 제공 equals 사용
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("리터럴 == 비교1: " + (str3 == str4));
        System.out.println("리터럴 == 비교2: " + str3.equals(str4));
    }
}
