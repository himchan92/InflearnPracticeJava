package loop;

public class While2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        while(i <= endNum) { //3까지 반복
            sum = sum + i; //누적합
            System.out.println("i= " + i + "sum =" + sum);
            i++;
        }
    }
}
