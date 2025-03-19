package collection.array;

import java.util.Arrays;

public class ArrayMain2 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        System.out.println("배열 3위치에 추가");
        int newValue = 3;

        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));

        int index = 2;
        int value = 4;
        addAtIndex(arr, index, value);
        System.out.println(Arrays.toString(arr));
    }

    private static void addAtIndex(int[] arr, int index, int value) {
        //기존 값 뒤로 밀리기(중간에 넣는것이니 index 까지만 이동)
        for(int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        //해당 인덱스에 값 넣기
        arr[index] = value;
    }

    private static void addFirst(int[] arr, int newValue) {
        //기존 배열 한칸씩 뒤로 이동 후 삽입
        for(int i = arr.length -1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = newValue;
    }
}
