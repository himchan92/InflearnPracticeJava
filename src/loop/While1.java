package loop;

public class While1 {

  public static void main(String[] args) {
    int count = 0;

    while(count < 3) { //조건 만족할동안 돌기
      count++; //증감
      System.out.println("현재 숫자는 " + count);
    }
  }

}
