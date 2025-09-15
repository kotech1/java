public class Counter {
    public static void main(String[] args) {
        double count = 0;
        while (count != 10.0) {
            count = count + 0.1;
            System.out.println(count);
        }
        System.out.println("완료!");
    }
}
