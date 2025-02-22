package extends1.super2;

public class ClassC extends ClassB {

    //기본생성자 불가사유 : 상속받은 ClassB 부모에는 기본생성자가 없기때문이다.
    public ClassC() {
        super(10, 20); //부모 생성자 상속받았으니 참조 시 부모생성자 파라미터 맞게 호출
        System.out.println("ClassC 생성자");
    }
}
