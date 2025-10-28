import java.util.*;

public class DequeQueue {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();

        // enqueue (offer)
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        // peek (맨 앞 원소 확인, 제거하지 않음)
        System.out.println("Front element: " + queue.peek()); // 1

        // dequeue (poll)
        System.out.println(queue.poll()); // 1
        System.out.println(queue.poll()); // 2

        // 남은 원소 출력
        System.out.println(queue); // [3]

        // 빈 큐에서 동작 확인
        queue.clear();
        System.out.println(queue.peek()); // null
        System.out.println(queue.poll()); // null
    }
}
