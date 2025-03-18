package generic.ex1;

public class ObjectBox {

    //Object 모든타입의 부모이기에 자료형 모두 커버가능
    private Object value;

    public void set(Object object) {
        this.value = object;
    }

    public Object get() {
        return value;
    }
}
