package cond;

public class If4 {
    public static void main(String[] args) {
        int age = 8;

        if(age <= 7) {
            System.out.println("미취학");
        }
        else if(age >= 8 && age <= 13) {
            System.out.println("초등학생");
        }
        else if(age >= 13 && age <= 17) {
            System.out.println("중학생");
        }
        else if(age >= 17 && age <= 19) {
            System.out.println("고등학생");
        }
        else {
            System.out.println("성인");
        }
    }
}
