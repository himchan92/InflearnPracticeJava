package scanner.ex;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요:");
        String name = sc.nextLine();
        System.out.print("당신의 나이를 입력하세요:");
        int age = sc.nextInt();

        System.out.println("이름은 " + name + " 나이는 " + age);

        sc.close();
    }
}
