package collection.map.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackHistoryTest {

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("youtube.com");
        stack.push("google.com");
        stack.push("facebook.com");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
