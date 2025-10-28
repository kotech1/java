import java.util.*;

public class Queue<E> {
    private List<E> list = new ArrayList<>();

    public void enqueue(E e) {
        list.addLast(e); // JDK21+
    }

    public E dequeue() {
        return list.removeFirst(); // JDK21+
    }

    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.dequeue()); // 1
        System.out.println(q.dequeue()); // 2
    }
}
