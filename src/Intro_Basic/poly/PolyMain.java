package Intro_Basic.poly;

public class PolyMain {

    public static void main(String[] args) {
        System.out.println("parent -> child");
        Parent p = new Parent();
        p.parentMethod();

        //자식이 자식참조
        Child child = new Child();
        System.out.println("Child -> child");
        child.parentMethod(); //부모에게 상속받은 자식은 부모메소드 호출가능
        child.childMethod();

        //부모가 자식인스턴스 참조(다형성)
        System.out.println("Parent -> child");
        Parent poly = new Child();
        poly.parentMethod();

        //자식은 부모를 담을 수 없다(다형성)
        //Child child1 = new Parent();
        //poly.parentMethod(); // 불가능 : Poly 가 자식을 참조하고있기때문이다.
    }
}
