// Op6.java
public class Op6 {
    public static void main(String[] args) {
        int a, b, c;

        a = (b = (c = 0)); // a = b = c = 0
        a = b = c = 2;
        a *= b = c += 1; // a = 6, b = 3, c = 3

        System.out.printf("%d, %d, %d%n", a, b, c);

        int max = (a > b) ? a : b;

        int pay = (b != 0) ? a/b : 0;

        byte[] s = {'J','a','v','a', 0};
        byte[] t = new byte[10];
        int i = 0;
        
        while ((s[i++] = t[i++]) != 0);
    }
}

