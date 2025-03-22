package collection.deque;

import java.util.Stack;

public class StackMain {

    public static void main(String[] args) {
        //스택 : 나올땐 가장 마지막에 넣은게 먼저 나오기
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        // 조회하기
        System.out.println("peek : " + stack.peek());

        // 요소 뽑기
        System.out.println("pop : " + stack.pop());
        System.out.println("pop : " + stack.pop());
        System.out.println("pop : " + stack.pop());
        System.out.println(stack);
    }
}
