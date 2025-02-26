package middle1.lang.enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values)); //배열 -> 문자열

        for(Grade grade : values) {
            //이름(name()), Enum 객체에 선언한 순서로 해당 인덱스(ordinal()) 출력
            //ordinal은 ENUM에서 중간에 항목추가 시 전체 인덱스 변경되니 권장하지 않음
            System.out.println("name = " + grade.name() + ", ordinal=" + grade.ordinal());
        }

        //String -> ENUM 변환
        String input = "gold"; //잘못입력시 컴파일에러체크
        //Grade gold = Grade.valueOf(input);
        //System.out.println("gold = " +gold);
    }
}
