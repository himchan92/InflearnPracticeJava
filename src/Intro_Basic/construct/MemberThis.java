package Intro_Basic.construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; //멤버변수 구분을 위해 this 사용하나 IDE 툴에서 같은 필드끼리 색상동일하게 보여줘서 생략가능
    }
}
