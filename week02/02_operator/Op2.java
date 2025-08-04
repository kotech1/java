// Op2.java
public class Op2 {
    public static void main(String[] args) {

        boolean b;
        b = (3.0 == 3); // true
        b = (1.0 + 2.0 == 3.0); // true
        b = (0.1 + 0.2 == 0.3); // false
        System.out.println(b);

        double eps = 1e-6;
        b = (0.1 + 0.2 < 0.3+eps && 
             0.1 + 0.2 > 0.3-eps); // true
        System.out.println(b);
    }
}

