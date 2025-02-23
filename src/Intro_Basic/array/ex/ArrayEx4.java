package Intro_Basic.array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int cnt = sc.nextInt();

        int[] num = new int[cnt];
        System.out.println(cnt + "개의 정수를 입력하세요:");
        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        int max = num[0], min = num[0];

        for(int item : num) {
            if(item > max) {
                max = item;
            }

            if(item < min) {
                min = item;
            }
        }

        System.out.println("가장 큰 정수: " + max);
        System.out.println("가장 작은 정수: " + min);


        sc.close();
    }
}
