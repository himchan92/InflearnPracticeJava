package scanner.ex;

import java.util.Scanner;

public class ScannerEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫숫자");
        int num = sc.nextInt();

        System.out.println("둘숫자");
        int num2 = sc.nextInt();

        for(int i = ((num > num2) ? num2 : num); i <= ((num > num2) ? num : num2); i++) {
            if (i < ((num > num2) ? num : num2)) {
                System.out.print(i + ",");
            }
            else {
                System.out.print(i);
            }
        }

        sc.close();
    }
}
