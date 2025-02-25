package middle1.lang.string.immutable;

public class StringImmuatable2 {

    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java"); //String 불변객체로 별도 생성안하고 바로 대입시 변경안된다.
        System.out.println("str = " + str);

        //변경 필요 시 String으로 별도 생성 후 사용
        String str2 = " java";
        String result = str.concat(str2);
        System.out.println("str new = " + result);
    }
}
