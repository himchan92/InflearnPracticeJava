package middle1.lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
        System.out.println("index = " + index);

        while(index >= 0) {
            index = str.indexOf(key, index + 1); // 찾으면 다음 인덱스 탐색
            count++;
        }
        System.out.println("count = " + count);
    }
}