package scanner;

import java.util.Scanner;

public class ScannerWhile1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("문자열 입력하세요: ");
            String str = sc.nextLine();
            if("exit".equals(str)) {
                break;
            }
        }

        sc.close();
    }
}
