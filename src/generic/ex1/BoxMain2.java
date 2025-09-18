package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {
        //모든 타입 조상인Object 타입으로 다형성처리 타입커버
        ObjectBox objectBox = new ObjectBox();
        objectBox.set(10);
        Integer integer = (Integer) objectBox.get();
        System.out.println("integer=" + integer);
    }
}
