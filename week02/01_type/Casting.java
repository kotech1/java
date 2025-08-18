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
        System.out.println(e); // Infinity
        int f;
        f = (int)d;
        System.out.println(f); 
        System.out.printf("0x%04x\n", f); 

        short g = (short)3e100;
        System.out.println(g); 

        // 최대/최소 크기 확인
        System.out.println("byte의 최댓값: " + Byte.MAX_VALUE);
        System.out.println("byte의 최솟값: " + Byte.MIN_VALUE);

        System.out.println("char의 최댓값: " + (int)Character.MAX_VALUE);
        System.out.println("char의 최솟값: " + (int)Character.MIN_VALUE);

        System.out.println("short의 최댓값: " + Short.MAX_VALUE);
        System.out.println("short의 최솟값: " + Short.MIN_VALUE);

        System.out.println("int의 최댓값: " + Integer.MAX_VALUE);
        System.out.println("int의 최솟값: " + Integer.MIN_VALUE);

        System.out.println("long의 최댓값: " + Long.MAX_VALUE);
        System.out.println("long의 최솟값: " + Long.MIN_VALUE);

        System.out.println("float의 최댓값: " + Float.MAX_VALUE);
        System.out.println("float의 최솟값: " + Float.MIN_VALUE);

        System.out.println("double의 최댓값: " + Double.MAX_VALUE);
        System.out.println("double의 최솟값: " + Double.MIN_VALUE);

        System.out.println("byte의 bit 수: " + Byte.SIZE);     // 8
        System.out.println("short의 bit 수: " + Short.SIZE);   // 16
        System.out.println("int의 bit 수: " + Integer.SIZE);   // 32
        System.out.println("long의 bit 수: " + Long.SIZE);     // 64
    }
}

