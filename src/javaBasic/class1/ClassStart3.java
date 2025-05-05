package javaBasic.class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student;
        student = new Student(); //객체 생성 = 메모리 할당 = 인스턴스 생성
        // .(참조) 이용해서 해당 메모리에 존재하는 객체 접근
        student.name = "학생1";
        student.age = 10;
        student.grade = 90;

        Student student1 = new Student();
        student1.name = "학생2";
        student1.age = 20;
        student1.grade = 100;

        //참조변수 = 메모리값 출력
        System.out.println(student);
        System.out.println(student1);

        System.out.println(student.name + ", " + student.age + ", " + student.grade);
        System.out.println(student1.name + ", " + student1.age + ", " + student1.grade);
    }
}
