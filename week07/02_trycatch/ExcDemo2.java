// ExcDemo2.java
public class ExcDemo2 {
    public static void main(String[] args) {
        try {
            Object[] arr = new Object[Integer.MAX_VALUE];  // OutOfMemoryError
            arr[0] = 1;
        } catch (Throwable t) {
            System.out.println("Throwable 잡힘: " + t);
        }

        System.out.println("정상 종료?");
    }
}
