package javaBasic.class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] names = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] grades = {90, 80};

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ", " + studentAges[i] + ", " + grades[i]);
        }
    }
}
