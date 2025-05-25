package array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("5개 정수를 입력하세요");
        int[] num = new int[5];
        for(int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(num));

        sc.close();
    }
}
