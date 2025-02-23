package Intro_Basic.class1;

public class ClassStart3 {

    public static void main(String[] args) {
        // new 연산자 : 객체생성 or 인스턴스화 or 메모리 할당, 사용할때마다 주소값 달라짐
        // . 연산자 : 참조, 메모리 접근, 객체접근
        Student stu = new Student();
        stu.name = "학생1";
        stu.age = 15;
        stu.grade = 90;

        Student stu2 = new Student();
        stu2.name = "학생2";
        stu2.age = 16;
        stu2.grade = 80;

        System.out.println("이름: " + stu.name + " 나이: " + stu.age + " 성적: " + stu.grade);
        System.out.println("이름: " + stu2.name + " 나이: " + stu2.age + " 성적: " + stu2.grade);
    }
}
