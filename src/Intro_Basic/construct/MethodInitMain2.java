package Intro_Basic.construct;

public class MethodInitMain2 {

    public static void main(String[] args) {
        MemberInit memberInit = new MemberInit();
        initMember(memberInit, "user1", 15, 80); //파라미터만 설정해서 생성자호출함으로써 반복제거 및 개발용이

        MemberInit memberInit1 = new MemberInit();
        initMember(memberInit1, "user2", 20, 100);

        MemberInit[] members = {memberInit, memberInit1};

        for(MemberInit m : members) {
            System.out.println("이름: " + m.name + " , 나이: " + m.age + " , 점수: " + m.grade);
        }
    }
    
    //생성자 : 자기자신의 데이터를 변경, 반복 제거, 메소드로 따로 빼서 객체지향적으로 별도관리
    static void initMember(MemberInit memberInit, String name, int age, int grade) {
        memberInit.name = name;
        memberInit.age = age;
        memberInit.grade = grade;
    }
}
