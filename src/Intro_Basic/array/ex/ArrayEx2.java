package Intro_Basic.array.ex;

import java.util.Scanner;

public class ArrayEx2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[5];

        for(int i = 0; i < 5; i++) {
            int num = sc.nextInt();
            array[i] = num;
        }

        for(int num : array) {
            System.out.print(num + ", ");
        }
        sc.close();
    }
}
