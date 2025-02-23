package Intro_Basic.construct;

public class ConstructMain1 {

    public static void main(String[] args) {
        //생성자 : 인스턴스 호출(new,객체화)하고 바로 호출(파라미터 셋팅)
        //장점 : 중복호출제거
        //참고 : 파라미터 없는 디폴트생성자 내재되어있으나 직접 파라미터있는 생성자 만든경우 반드시 호출해야한다
        MemberConstruct m = new MemberConstruct("user1", 10, 20); //생성자 매개변수
        MemberConstruct m2 = new MemberConstruct("user2", 20, 100);

        MemberConstruct[] memberConstructs = {m, m2};

        for(MemberConstruct item : memberConstructs) {
            System.out.println("이름 = " + item.name + " , 나이: " + item.age + ", 점수 = " + item.grade);
        }
    }
}
