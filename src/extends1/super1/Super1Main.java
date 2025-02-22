package extends1.super1;

public class Super1Main {
    //부모 상속받은 자식은 호출 시 부모 메모리까지 같이 생성된다.
    public static void main(String[] args) {
        Child child = new Child();
        child.hello();
        child.call(); //super 부모, this 자식(=자기자신)
    }
}
