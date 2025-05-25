package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. 상품등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요:");
            int menu = sc.nextInt();
            sc.nextLine();
            String name = "";
            int price = 0;

            String[] names = new String[3];
            int[] prices = new int[3];

            switch(menu) {
                case 1:
                    System.out.print("이름");
                    names[0] = sc.nextLine();
                    System.out.println("가격");
                    prices[0] = sc.nextInt();
                    sc.nextLine();
                    break;

                case 2:
                    System.out.println(names[0]);
                    System.out.println(prices[0]);
                    break;

                default:
                    break;
            }

            if(menu == 3) {
                break;
            }
        }

        System.out.println("프로그램 종료");

        sc.close();
    }
}
