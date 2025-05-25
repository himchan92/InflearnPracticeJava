package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("정수를 입력하시오");
        int num = sc.nextInt();

        System.out.println((num % 2 == 0) ? "숫자 " + num + "은 짝수": "숫자 " + num + "은 홀수");
    }
}
