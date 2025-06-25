// Casting.java
public class Casting {
    public static void main(String[] args) {
        int a = 3;
        double b;
        b = (double)a; // 3.0
        System.out.println(b); 
        int c;
        c = (int)b; // 3
        System.out.println(c); 
        
        double d = 1e308;
        float e;
        e = (float)d;
        System.out.println(e); 
        int f;
        f = (int)d;
        System.out.println(f); 
    }
}

