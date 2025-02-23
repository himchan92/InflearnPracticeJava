package Intro_Basic.construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;
    
    /*
        생성자: 객체생성하자마자 초기화 사용 지원
                반환타입없음
                생성자명 = 클래스명
     */
    public MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + " , age=" + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //생성자 추가 가능
    MemberConstruct(String name, int age) {
        this(name, age, 45); //this 오버로딩 : 생성자안에서만 사용가능하며 중복제거 장점, 단, 첫줄에서만 작성가능되고 아니면 오류
    }

}
