package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int count = 0;

        System.out.print("숫자입력(-1이면 종료):");
        while(true) {
            num = sc.nextInt();

            if(num == -1) {
                break;
            }
            sum += num;
            count++;
        }
        System.out.println("입력합계: " + sum);
        System.out.println("평균: " + sum / count);
        sc.close();
    }
}
