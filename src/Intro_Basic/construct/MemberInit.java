package Intro_Basic.construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //this : 객체 멤버를 참조, 자기자신의 인스턴스(=객체) 가리킴, 멤버의 초기값 설정 제공
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
