package Intro_Basic.construct;

public class MethodInitMain3 {

    public static void main(String[] args) {
        MemberInit memberInit = new MemberInit();
        memberInit.initMember("user1", 19, 90); //객체 this 참조 생성자로 간편하게 호출, 반복제거, 관리용이



        MemberInit memberInit1 = new MemberInit();
        memberInit1.initMember("user2", 20, 100);

        MemberInit[] memberInits = {memberInit, memberInit1};

        for(MemberInit m : memberInits) {
            System.out.println("이름: " + m.name + ", 나이: " + m.age + ", 점수: " + m.grade);
        }
    }
}
