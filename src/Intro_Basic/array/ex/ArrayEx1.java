package Intro_Basic.array.ex;

public class ArrayEx1 {

    public static void main(String[] args) {
        int[] student = {90, 80, 70, 60, 50};

        int total = 0;
        for(int item : student) {
            total += item;
        }
        double average = total / student.length;
        System.out.println("총합 : " + total);
        System.out.println("평균 : " + average);
    }
}
