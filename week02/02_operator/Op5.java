// Op4.java
public class Op4 {
    public static void main(String[] args) {
        int a = 3, b = 0, c = 7;

        if ( (a > 3 && b > 1) || c != 0 ) 
           System.out.println("A process");
        else
           System.out.println("B process");

        if (!((a > 3 && b > 1) || c != 0) ) 
           System.out.println("B process");
        else
           System.out.println("A process");

        if ( (a <= 3 || b <= 1) && c == 0 ) 
           System.out.println("B process");
        else
           System.out.println("A process");
    }
}

