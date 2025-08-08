package cond;

public class If1 {
    public static void main(String[] args) {
        int age = 20;

        if(age >= 18) {
            System.out.println(age);
        }

        if(age < 18) {
            System.out.println("미성년자");
        }
    }
}