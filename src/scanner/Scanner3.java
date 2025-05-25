package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("입력하기");

            int num = sc.nextInt();
            System.out.println(num);
            if(num == 0) {
                break;
            }
        }

        sc.close();
    }
}
