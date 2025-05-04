package loop;

public class While1 {

    public static void main(String[] args) {
        int count = 0;

        while(count < 3) { //조건만족할때까지 반복 수행
            count++;
            System.out.println("현재 숫자는 " + count);
        }
    }
}
