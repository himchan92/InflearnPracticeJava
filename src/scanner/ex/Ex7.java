package scanner.ex;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("이름을 입력하세요:");
            String name = sc.nextLine();

            if(name.equals("종료")) {
                break;
            }

            int age = sc.nextInt();
            sc.nextLine();
            System.out.println(name + ", " + age);
        }

        sc.close();
    }
}
