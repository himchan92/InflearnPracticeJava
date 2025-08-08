package operator;

public class Operator3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        boolean result = a == b;
        System.out.println(result);

        String str1 = "string";
        String str2 = "string";
        System.out.println(str1.equals(str2));

        boolean result1 = "start".equals("start");
        System.out.println(result1);
    }
}