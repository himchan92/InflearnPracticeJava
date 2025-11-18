package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        int tmp;

        //교환
        tmp = b;
        b = a;
        a = tmp;

        System.out.println(a);
        System.out.println(b);
    }
}
