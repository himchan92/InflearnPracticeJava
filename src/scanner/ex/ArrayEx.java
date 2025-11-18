package scanner.ex;

import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        int min = 0;
        int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할갯수:");
        int count = sc.nextInt();
        int[] nums = new int[count];
        System.out.println(count + "개 정수를 입력하세요");

        for(int i = 0; i < count; i++) {
            nums[i] = sc.nextInt();
            min = nums[0];
            if(max < nums[i]) max = nums[i];
            if(min > nums[i]) min = nums[i];
        }

        System.out.println("작은정수 " + min);
        System.out.println("작은정수 " + max);

        sc.close();
    }
}
