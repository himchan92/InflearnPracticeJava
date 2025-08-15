package scanner;

import java.util.Scanner;

public class Scanner1 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("문자열 입력");
    String str = scanner.nextLine();
    System.out.println("입력한 문자열: " + str);

    System.out.print("숫자 입력");
    int num = scanner.nextInt();
    System.out.println("입력한 숫자: " + num);

    System.out.print("소수 입력");
    double dou = scanner.nextDouble();
    System.out.println("입력한 소수: " + dou);

  }

}
