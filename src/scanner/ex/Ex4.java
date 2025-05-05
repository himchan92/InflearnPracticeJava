package scanner.ex;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("구구단의 단을 입력해주세요:");
        int dan = sc.nextInt();

        for(int j = 1; j < 10; j++) {
            System.out.println(dan + " x " + j + " = " + (dan * j));
        }

        sc.close();
    }
}
