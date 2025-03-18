package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox objectBox = new ObjectBox();
        objectBox.set(10);
        Object object = objectBox.get();

        Integer integer = (Integer)object; //Object -> Integer
        System.out.println("Integer = " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String)stringBox.get(); //Object -> String
        System.out.println("str = " + str);

        objectBox.set("hello10"); //단점 : 실수로 잘못된 타입 넣을 시 예외발생으로 타입안전성이 낮음..
        Integer result = (Integer) objectBox.get(); //String -> Integer 캐스팅 예외
        System.out.println("result = " + result);
    }
}
