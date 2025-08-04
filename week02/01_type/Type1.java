// Type1java
public class Type1 {
    public static void main(String[] args) {
        byte a = 3;
        short b = 32767;
        System.out.println(b); // 32767
        b += 1;
        System.out.println(b); // -32768
        //short sVal3 = 32768;  // error
        short c = (short)32768; // -0x8000
        System.out.println(c); // -32768

        // 32768        = 0x0000_8000
        System.out.printf("0x%08x\n", 32768);
        // (short)32768 = 0x8000

        short d = -0x8000;     // 0xffff_8000 = -32768
        System.out.println(d);

        System.out.printf("-0x8000 = 0x%08x\n", -0x8000);

        int e = 473243434; 
        long f = 49293848233L;
    }
}

