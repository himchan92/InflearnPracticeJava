package cond;

public class If3 {
    public static void main(String[] args) {
        int age = 14;

        if(age <= 7) {
            System.out.println("아동");
        }

        if(age >= 8 && age <= 13) {
            System.out.println("초등학생");
        }

        if(age >= 14 && age <= 19) {
            System.out.println("고등학생");
        }

        if(age >= 20) {
            System.out.println("성인");
        }
    }
}
