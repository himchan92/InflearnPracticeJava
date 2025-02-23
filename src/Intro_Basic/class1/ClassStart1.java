package Intro_Basic.class1;

class Test {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ClassStart1 {

    public static void main(String[] args) {
        Test stu = new Test();
        stu.setName("학생1");
        stu.setAge(15);
        System.out.println("이름: " + stu.getName() + " 나이: " + stu.getAge());

        stu.setName("학생2");
        stu.setAge(16);
        System.out.println("이름: " + stu.getName() + " 나이: " + stu.getAge());
    }
}
