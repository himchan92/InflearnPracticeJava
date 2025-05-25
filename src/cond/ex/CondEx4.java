package cond.ex;

public class CondEx4 {
    public static void main(String[] args) {
        double rating = 8;

        if(rating >= 9) {
            System.out.println("어바웃 타임");
        }
        else if(rating >= 8) {
            System.out.println("토이스토리");
        }
        else if(rating >= 7) {
            System.out.println("고질라");
        }
    }
}
