package generic;

public class BoxMain1 {
    public static void main(String[] args) {
        //모든타입 허용하는 최상위 객체
        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get();
        System.out.println("str = " + str);
    }
}
