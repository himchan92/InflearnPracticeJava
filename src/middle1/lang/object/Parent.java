package middle1.lang.object;

// 상속받을 부모 없으면 묵시적으로 Object 상속받음 = 이미 명시적으로 상속되어서 작성안해도 됨(생략권장)
public class Parent { // extends Object 동일
    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}
