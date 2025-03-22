package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        //데이터 추가
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);

        //다음 꺼낼 데이터 확인
        System.out.println("peek : " + deque.peek()); //마지막 요소나옴

        //데이터 꺼내기(pop) : 마지막요소부터 꺼내짐
        System.out.println("pop : " + deque.pop());
        System.out.println("pop : " + deque.pop());
        System.out.println("pop : " + deque.pop());
        System.out.println(deque);

        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println(deque);

        // 꺼낼 데이터 확인(peek) : 먼저넣은것 먼저 나옴
        System.out.println("peek : " + deque.peek());

        //꺼내기 : 먼저넣은게 먼저 나옴
        System.out.println("poll : " + deque.poll());
        System.out.println("poll : " + deque.poll());
        System.out.println("poll : " + deque.poll());
        System.out.println(deque);
    }
}
