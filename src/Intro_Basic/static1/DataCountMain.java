package Intro_Basic.static1;

public class DataCountMain {

    public static void main(String[] args) {
        /*
         객체 인스턴스 생성 때 마다 새로 생성되기에 누적 증감이 안된다.
         */
        Data1 d = new Data1("A");
        System.out.println("A count = " + d.count);
    }
}
