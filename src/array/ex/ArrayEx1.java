package array.ex;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = new int[5];

        int total = 0;
        for(int i = 0; i < students.length; i++) {
            students[i] = i;
            total += students[i];
        }

        double average = total / students.length;

        System.out.println("총합 " + total);
        System.out.println("평균 " + average);
    }
}
