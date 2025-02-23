package Intro_Basic.scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("음식 이름을 입력해주세요:");
        String food = sc.nextLine();

        System.out.print("음식의 가격을 입력해주세요:");
        int price = sc.nextInt();

        System.out.print("음식의 수량을 입력해주세요");
        int count = sc.nextInt();

        System.out.println("피자를 " + count + "개 주문하셨습니다. 총 가격은 " + (price * count) + "원 입니다.");

        sc.close();
    }
}
