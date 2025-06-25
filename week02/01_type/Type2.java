// Type2.java
public class Type2 {
    public static void main(String[] args) {
        short a, b, c;
        a = 8234;
        b = 324;
        c = (short)(a*b);
        System.out.println("c = "+c);
        a = 32767;
        b = 1;
        c = (short)(a+b);
        System.out.println("c = "+c);

        int e, f, g;
        e = 483029843;
        f = -323409345;
        g = e*f;
        System.out.println("g = "+g);
        
    }
}

