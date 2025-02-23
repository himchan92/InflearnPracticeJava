package Intro_Basic.scanner.ex;

import java.util.Scanner;

public class ScannerEx7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료):");
            int num = sc.nextInt();

            if(num == -1) {
                break;
            }

            System.out.print("구매하려는 수량을 입력하세요:");
            int cnt = sc.nextInt();

            System.out.println("총 비용: " + num * cnt);
        }

        sc.close();
    }
}
