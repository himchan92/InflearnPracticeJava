package middle1.lang.object.tostring;

/*
    toString()
     - Object 제공
     - 객체 정보 반환

    System.out.println()
     - Object 제공
     - 내부적으로 toString() 호출
 */
public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        // object 제공해주는 toString 출력
        System.out.println(string);

        // object 직접 출력
        System.out.println(object);
    }
}
