//import java.io.*;
import java.io.IOException;

public class ReadConsole {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[10];
        System.out.println("입력하세요.");
        System.in.read(data);
        System.out.print("입력 내용: ");
        for(int i = 0; i < data.length; i++)
            //System.out.print((char) data[i]);
            System.out.write(data[i]);
    }
}
