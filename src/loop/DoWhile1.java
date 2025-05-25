package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        //조건 안따지고 한번 필수 수행
        int i = 10;

        do {
            System.out.println("현재 숫자는 " + i);
            i++;
        } while(i < 3);

        /*while(i < 3) {
            System.out.println("현재 숫자는 " + i);
            i++;
        }*/
    }
}
