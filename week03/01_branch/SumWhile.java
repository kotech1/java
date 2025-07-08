// SumWhile.java
public class SumWhile {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int n = 100;
        
        while (i <= n)
            sum += i++; // Is it beautiful?
            // sum += i;
            // i++;

        System.out.println("sum = " + sum); // sum = 5050
    }
}


