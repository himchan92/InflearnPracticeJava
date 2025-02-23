package Intro_Basic.construct;

public class MethodInitMain1 {

    public static void main(String[] args) {
        MemberInit memberInit = new MemberInit();
        memberInit.name = "user1";
        memberInit.age = 15;
        memberInit.grade = 100;

        MemberInit memberInit1 = new MemberInit();
        memberInit1.name = "user2";
        memberInit1.age = 16;
        memberInit1.grade = 80;

        MemberInit[] members = {memberInit, memberInit1};

        for(MemberInit m : members) {
            System.out.println("이름: " + m.name + " , 나이: " + m.age + " , 점수: " + m.grade);
        }
    }
}
