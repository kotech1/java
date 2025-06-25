// Type1java
public class Type1 {
    public static void main(String[] args) {
        byte a = 3;
        short b = 32767;
        System.out.println(b);
        b += 1;
        System.out.println(b);
        //short sVal3 = 32768;  // error
        short c = (short)32768; // -0x8000
        System.out.println(c);
        short d = -0x8000; 
        System.out.println(d);

        int e = 473243434; 
        long f = 49293848233L;
    }
}

