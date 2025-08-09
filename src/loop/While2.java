package loop;

public class While2 {

  public static void main(String[] args) {
    int count = 0;

    while(count < 3) { //조건 명시해야하며 true나 미만족 시 무한루프나오니 탈출조건 넣자
      count = count + 1;
      System.out.println("현재 숫자는 " + count);
    }
  }
}
