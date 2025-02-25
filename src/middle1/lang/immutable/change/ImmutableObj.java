package middle1.lang.immutable.change;

public class ImmutableObj {
    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    //불변객체 변경 : 기존값그대로 복사나 변경안되므로 변경필요시 new 신주소 할당하여 변경만 가능
    public ImmutableObj add(int add) {
        return new ImmutableObj(value + add);
    }

    //불변은 값변경 안되서 setter 불가
}
