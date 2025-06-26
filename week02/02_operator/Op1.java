// Op1.java
public class Op1 {
    public static void main(String[] args) {
        int a, b, c;

        a = 3;
        b = 2;
        c = a / b; // 1 
        System.out.println(c);
        
        double d, e, f;
        d = 3;
        e = 2;
        f = d / e; // 1.5
        System.out.println(f);
        
        f = 3/2; // 1.0
        f = (double)3/2; // 1.5 
        System.out.println(f);

        f = 3.2%3.1; // 0.1
        f = -3.2%3.1; // -0.1
        System.out.println(f);
    }
}

