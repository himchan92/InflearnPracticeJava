package middle1.exception.ex0;

import java.util.Scanner;

public class MainVO {

    public static void main(String[] args) {
        NetWorkServiceVo netWorkServiceVo = new NetWorkServiceVo();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();

            // exit 입력하면 종료
            if(input.equals("exit")) {
                break;
            }

            netWorkServiceVo.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램 정상 종료");

        scanner.close();
    }

}
