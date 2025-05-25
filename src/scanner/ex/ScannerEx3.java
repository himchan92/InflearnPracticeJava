package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("음식이름은?");
        String food = sc.nextLine();

        System.out.println("음식가격은");
        int price = sc.nextInt();

        System.out.println("수량은");
        int quantity = sc.nextInt();

        System.out.println(food + " " + quantity + "개를 주문하였습니다. 가격은 " + (price * quantity) +"원 입니다.");

        sc.close();
    }
}
