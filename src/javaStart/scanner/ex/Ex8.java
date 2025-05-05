package javaStart.scanner.ex;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double average = 0.0;

        while(true) {
            System.out.print("숫자를 입력하세요:");
            int num = sc.nextInt();

            if(num == -1) {
                break;
            }

            sum += num;
            count++;
        }
        average = sum / count;
        System.out.println(sum);
        System.out.println(average);


        sc.close();
    }
}
