// Basic1.java
public class Basic1 {
    public static void main(String[] args) {
        byte b;
        b = 0b0000_1001;
        // 0000 0x0 0 
        // 0001 0x1 1
        // 0010 0x2 2
        // 0011 0x3 3
        // 0100 0x4 4
        // 0101 0x5 5
        // 0110 0x6 6
        // 0111 0x7 7 
        // 1000 0x8 8
        // 1001 0x9 9
        // 1010 0xa 10
        // 1011 0xb 11
        // 1100 0xc 12
        // 1101 0xd 13
        // 1110 0xe 14
        // 1111 0xf 15
        System.out.printf("%d 0x%02x %03o\n", b, b, b);
        b = 011; // 8진수 octal
        System.out.printf("%d 0x%02x %03o\n", b, b, b);

        System.out.println("1의 보수");
        // 1의 보수= 더하면 0b1111_1111이 되는 수
        b = (byte)0b0000_0000;
        b += ~b;//0b1111_1111;
        System.out.printf("%d 0x%02x\n", b, b);
        b = (byte)0b0101_1010; // 0x5a
        b += ~b;//0b1010_0101;
        System.out.printf("%d 0x%02x\n", b, b);
        
        System.out.println("2의 보수");
        // 2의 보수 = 더하면 2^(최대비트수) 가 되는 수
        b = (byte)0b1111_1111; // 0xff --> -1
        b +=      0b0000_0001; // 0x01 --> 1
        //        0b0000_0000; 폭이 정해져 있으므로 넘치는 1은 무시
        System.out.printf("%d 0x%02x\n", b, b);
        b = (byte)0b1111_1110; // 0xfe --> -2
        b +=      0b0000_0010; // 0x02 --> 2
        //        
        System.out.printf("%d 0x%02x\n", b, b);
        System.out.printf("%d 0x%02x\n", b, b);
        b = (byte)0b1111_1101; // 0xfd --> -3
        b +=      0b0000_0011; // 0x02 --> 3
        //        
        System.out.printf("%d 0x%02x\n", b, b);
        b = (byte)0b1000_0001; // 0x81 --> -127
        b +=      0b0111_1111; // 0x7f --> 127
        //        
        System.out.printf("%d 0x%02x\n", b, b);
        b = (byte)0b1000_0000; // 0x80 --> -128
        b +=      0b1000_0000; // 0x80 --> -128
        //        
        System.out.printf("%d 0x%02x\n", b, b);

        // 논리 AND
        b = (byte)0b0000_1100; // 0x0c
        b &=      0b0000_1010; // 0xa0
        //          0000_1000
        System.out.printf("AND %d 0x%02x\n", b, b);

        // 논리 OR
        b = (byte)0b0000_1100; // 0x0c
        b |=      0b0000_1010; // 0xa0
        //          0000_1110
        System.out.printf("OR %d 0x%02x\n", b, b);

        // 논리 XOR A^B = (A & ~B) | (~A & B)
        b = (byte)0b0000_1100; // 0x0c
        b ^=      0b0000_1010; // 0xa0
        //          0000_0110
        System.out.printf("XOR %d 0x%02x\n", b, b);

        // shift left  (곱하기 2^n과 같음)
        b = (byte)0b0000_1100; // 0x0c
        b <<= 1;
        //          0001_1000
        System.out.printf("shift left %d 0x%02x\n", b, b);

        // shift right (나누기 2^n과 같음)
        b = (byte)0b1100_0000; // 0xc0
        b >>= 1;
        //          1110_0000
        System.out.printf("shift right %d 0x%02x\n", b, b);

        // unsigned shift right wrong!
        b = (byte)0b1100_0000; // 0xc0
        b >>>= 1;
        //          1110_0000
        System.out.printf("%d 0x%02x\n", b, b);

        System.out.println("byte char short 연산");
        // 중요!: 자바의 byte,char,short의 연산은
        //        모두 int로casting되어 처리된다.
        // 따라서 연산 후, 해당 값을 캐스팅 할 필요가 있다.
        b = 1;
        //b = b + b; // compile error
        b = (byte)(b + b); // OK
        
        // unsigned shift right
        b = (byte)0b1100_0000; // 0xc0
        b = (byte)((b & 0xff) >>> 1);
        //          0110_0000
        System.out.printf("%d 0x%02x\n", b, b);

        System.out.println("Bit mask");
        int i, mask;
        i =    0b00000000_00000000_00000000_00000000; // 32bit
        mask = 0b00000000_00000000_00000000_00010000;

        // get bit value
        System.out.println((i & mask) != 0);

        // set bit value
        i |= mask;
        System.out.println((i & mask) != 0);

        // reset bit value
        i &= ~mask;
        System.out.println((i & mask) != 0);

        // flip bit value
        i ^= mask;
        System.out.println((i & mask) != 0);
        i ^= mask;
        System.out.println((i & mask) != 0);
    }
}

