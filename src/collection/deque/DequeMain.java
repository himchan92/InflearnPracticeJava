package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {

    public static void main(String[] args) {
        // 스택, 큐 모두 포함하였고 양쪽에서 넣고 빼고 할수있어 유용함
        Deque<Integer> deque = new ArrayDeque<>();

        //추가
        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);
        deque.offerLast(3);
        System.out.println(deque);
        deque.offerLast(4);
        System.out.println(deque);

        //다음 데이터 확인
        System.out.println("first : " + deque.peekFirst()); //첫요소 보기
        System.out.println("last : " + deque.peekLast()); //마지막요소 보기

        //꺼내기
        System.out.println("poll first : " + deque.pollFirst()); //첫째 꺼내기
        System.out.println("poll last : " + deque.pollLast()); //마지막 꺼내기

        // ArrayDeque 가 더 나은 성능을 제공하여 권장한다
        System.out.println(deque);
    }
}
