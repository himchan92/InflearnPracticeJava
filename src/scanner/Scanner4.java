package scanner;

import java.util.Scanner;

public class Scanner4 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int sum = 0;

    while(true) {
      System.out.print("정수를 입력하세요(0을 입력하면 종료):");
      int num = sc.nextInt();

      if(num == 0) {
        break;
      }

      sum += num;
    }

    System.out.println(sum);
    sc.close();
  }

}
