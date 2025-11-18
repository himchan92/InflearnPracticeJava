package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("하나의 정수를 입력하세요.");
        int num = sc.nextInt();
        System.out.println("입력한 숫자는 " + ((num % 2 != 0) ? "홀수": "짝수"));
        sc.close();
    }
}
