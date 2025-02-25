package middle1.lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        // StringBuilder : 가변으로 변경 가능하며 String 처럼 선언할때마다 메모리 할당되지않아 메모리 절약, 성능향상(문자열 활용 로직 시 권장)
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "java");
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse();
        System.out.println("reverse = " + sb);

        // 가변으로 메모리 절약 후 마지막 마무리는 불변 String 속성 사용 권장
        System.out.println("toString = " + sb.toString());
    }
}
