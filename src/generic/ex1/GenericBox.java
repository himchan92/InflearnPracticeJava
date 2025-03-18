package generic.ex1;

// 제네릭 : 모든 타입 허용, 타입 미리 결정안함, 대입한 자료형으로 보장
public class GenericBox<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
