package Intro_Basic.array;

public class Array1Ref1 {

    public static void main(String[] args) {
        int[] students = new int[5]; //5개 정수데이터 담을 그릇 생성
        int cnt = 0;

        /*
            인덱스 : 배열의 위치를 나타냄, 0부터 시작
         */
        for(int i = 0; i < students.length; i++) {
            students[i] = cnt += 10;
            System.out.println(students[i]);
        }

    }
}
