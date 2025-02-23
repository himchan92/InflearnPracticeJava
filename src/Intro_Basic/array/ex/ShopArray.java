package Intro_Basic.array.ex;

import java.util.Scanner;

public class ShopArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int productCount = 0;
        String[] productNames = new String[10];
        int[] productPrices = new int[10];

        while(true) {
            System.out.println("1. 상품등록 | 2. 상품목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요:");
            int menu = sc.nextInt();
            sc.nextLine();

            if(menu == 1) {

                if(i > 9) {
                    System.out.println("더 이상 상품을 등록할 수 업습니다.");
                    break;
                }

                System.out.print("상품 이름을 입력하세요:");
                String name = sc.nextLine();
                System.out.print("상품 가격을 입력하세요:");
                int price = sc.nextInt();
                productNames[i] = name;
                productPrices[i] = price;
                i++;
            }
            else if(menu == 2) {
                if(i == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    break;
                }
                for(int j = 0; j < i; j++) {
                    System.out.println(productNames[j] + ": " + productPrices[j] + "원");
                }
            }
            else {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
        }

        sc.close();
    }
}
