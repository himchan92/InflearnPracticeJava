package scanner.ex;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("음식을 입력해주세요:");
        String food = sc.nextLine();
        int price = sc.nextInt();
        int quantity = sc.nextInt();

        System.out.println(food + "를 " + quantity + "개 주문했습니다\n가격은 " + (price * quantity));

        sc.close();
    }
}
