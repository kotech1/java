// Op3.java
public class Op3 {
    public static void main(String[] args) {

        int a;
        a = 0x80 ^ 0x01; // 0x81 = 129
        a = ~0x80; // 0x7f = -129
        System.out.printf("0x%x\n", a);
        System.out.printf("%d\n", a);
        
    }
}

