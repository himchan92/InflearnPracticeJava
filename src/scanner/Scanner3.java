package scanner;

import java.util.Scanner;

public class Scanner3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while(true) {
      System.out.print("입력: ");
      String text = sc.nextLine();

      if(text.equals("exit")) {
        break;
      }

      System.out.println(text);
    }

    sc.close();
  }
}
