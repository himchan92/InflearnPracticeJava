package middle1.lang.object;

//직접 extends 상속처리했기에 Object 상속받지 않는다
// 결론 : Object 는 가장 최상위 부모
public class Child extends Parent{

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
