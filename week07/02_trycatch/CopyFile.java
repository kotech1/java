import java.io.*;
public class CopyFile {
    public static void main(String[] args) {
        int i;
        // First, confirm that both files have been specified.
        if(args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }
        // Open and manage two files via the try statement.
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1])) {
            while ((i = fin.read()) != -1) 
                fout.write(i);
        } catch(IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
