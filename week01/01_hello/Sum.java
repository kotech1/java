// Sum.java
public class Sum {
    public static void main(String[] args) {
        long sum = 0;
        long i = 1;
        long n = 100L;

        while (true) {
            sum = sum + i;
            if (i >= n) break;
            i++;
        }
        System.out.println("sum = " + sum);
    }
}

