package collection.deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) {
        // 큐 : 먼저 넣은게 먼저 나온것
        //Queue<Integer> queue = new LinkedList<>(); -> 아래 ArrayDeque 동일하여 둘중 하나 사용할것
        Queue<Integer> queue = new ArrayDeque<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        //다음 꺼낼 데이터 확인
        System.out.println("peek = " + queue.peek());

        //꺼내기
        System.out.println("poll : " + queue.poll());
        System.out.println("poll : " + queue.poll());
        System.out.println("poll : " + queue.poll());
        System.out.println(queue);
    }
}
