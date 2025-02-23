package Intro_Basic.cond.ex;

public class Cond2Ex1 {

    public static void main(String[] args) {
        int time = 9;
        int toy = 8;
        int go = 7;

        double rating = (time + toy + go) / 3.0;

        if(rating >= time) {
            System.out.println("어바웃타임 추천합니다.");
        }
        else if(rating >= toy) {
            System.out.println("어바웃타임을 추천합니다.");
            System.out.println("토이스토리 추천합니다.");
        }
        else if(rating >= go) {
            System.out.println("어바웃타임을 추천합니다.");
            System.out.println("토이스토리 추천합니다.");
            System.out.println("고질라 추천합니다.");
        }
    }
}
