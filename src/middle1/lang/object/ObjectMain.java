package middle1.lang.object;

// 부모 상속받은 자식 : 자식객체 생성 시 해당 부모도 같이 생성(메모리 할당)
// Object : 모든 객체의 최종 부모, 공통 기능 제공, 다형성 기본 구현(모든 객체를 다 참조 가능)
public class ObjectMain {

    public static void main(String[] args) {
        Child c = new Child();
        c.childMethod();
        c.parentMethod();

        // toString() : Object 제공 메소드, 객체에 대한 정보 제공
        String string = c.toString();
        System.out.println(string);
    }
}
