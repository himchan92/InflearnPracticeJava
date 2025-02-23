package Intro_Basic.extends1.super1;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value); //자기 참조
        System.out.println("super value = " + super.value); //부모 참조

        this.hello(); //자식
        super.hello(); //부모
    }
}
