package middle1.lang.immutable.address;

public class ImmutableAddress {
    private final String value; //final : 변경불가, 초기화 필수

    //final 초기화 필수로 인한 생성자 초기화
    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
