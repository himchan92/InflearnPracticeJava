package cond.ex;

public class CondEx4 {

  public static void main(String[] args) {
    double rating = 10;

    if(rating >= 9) {
      System.out.println("어바웃타임");
    }
    else if(rating >= 8 && rating < 9) {
      System.out.println("어바웃타임");
      System.out.println("토이스토리");
    }
    else if(rating >= 7 && rating < 8) {
      System.out.println("어바웃타임");
      System.out.println("토이스토리");
      System.out.println("고질라");
    }
  }
}
