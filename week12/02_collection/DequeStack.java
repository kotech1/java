import java.util.*;

public class DequeStack {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        // push
        stack.push(10); stack.push(20); stack.push(30);

        // peek (맨 위 원소 확인, 제거하지 않음)
        System.out.println("Top element: " + stack.peek()); // 30

        // pop (맨 위 원소 제거 + 반환)
        System.out.println("Pop: " + stack.pop()); // 30
        System.out.println("Pop: " + stack.pop()); // 20

        // 남은 원소 출력
        System.out.println("Remaining stack: " + stack); // [10]

        stack.clear();
        try {
            stack.pop(); // 예외 발생
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
