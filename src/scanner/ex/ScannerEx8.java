package scanner.ex;

import java.util.Scanner;

public class ScannerEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("상품 가격입력");
            int price = sc.nextInt();

            if(price == -1) {
                break;
            }

            System.out.println("수량을 입력");
            int quantity = sc.nextInt();

            System.out.println(" 총 비용 " + (price * quantity));
        }
        System.out.println("프로그램 종료");

        sc.close();
    }
}
