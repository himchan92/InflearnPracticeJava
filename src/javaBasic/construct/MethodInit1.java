package javaBasic.construct;

class MemberInit {
    String name;
    int age;
    int grade;
}

public class MethodInit1 {

    public static void main(String[] args) {
        MemberInit memberInit = new MemberInit();
        memberInit.name = "user1";
        memberInit.age = 15;
        memberInit.grade = 90;

        MemberInit memberInit2 = new MemberInit();
        memberInit2.name = "user2";
        memberInit2.age = 20;
        memberInit2.grade = 100;

        System.out.println(memberInit);
        System.out.println(memberInit2);
    }
}
