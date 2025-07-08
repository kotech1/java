// Precedence.java
public class Precedence {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        int d = a + b * c;
        d = a + b*c; // OK
        d = a + (b*c); // OK
        d = a+b * c; // maybe bug

        a = 2; b = 1;
        int x = a<<1 + b; // same as a << (1+b)
        x = (a << 1) + b;

        System.out.println(1 + 2 + "3" + "4");

        boolean s, t = true, f = false;
        s = t == true && f == false;
        s = (t == (true && f) == false);
    }
}

