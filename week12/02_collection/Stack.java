import java.util.*;

public class Stack<E> {
    private List<E> list = new ArrayList<>();

    // push: 맨 끝에 원소 추가
    public void push(E e) {
        list.addLast(e); 
    }

    // pop: 맨 끝 원소 제거 + 반환
    public E pop() {
        return list.removeLast();
    }

    // peek: 맨 끝 원소 확인 (제거 X)
    public E peek() {
        return list.getLast();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peek: " + stack.peek()); // 30
        System.out.println("Pop: " + stack.pop());  // 30
    }
}
