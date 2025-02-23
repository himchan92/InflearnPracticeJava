package Intro_Basic.construct;

public class ConstructMain2 {

    public static void main(String[] args) {
        MemberConstruct m = new MemberConstruct("user3", 12); //추가로 name, age 만 있는 생성자 만들어서 가능

        MemberConstruct[] memberConstructs = {m};
        for(MemberConstruct i : memberConstructs) {
            System.out.println(i.name + ", " + i.age + ", " + i.grade);
        }
    }
}
