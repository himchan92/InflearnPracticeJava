package middle1.lang.object.equals;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object object) {
        UserV2 user = (UserV2) object; //해당 객체 맞게 Object를 다운캐스팅해야 참조가능
//        boolean result = (id.equals(user.id)); //문자열은 equals로 비교
//        return result;
        return id.equals(user.id);
    }
}
