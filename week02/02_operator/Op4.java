// Op4.java
public class Op4 {
    public static void main(String[] args) {

        int a = 3, b = 0;
        if ( (b != 0) && ( a/b > 1) ) 
           System.out.println("ok");
        else
           System.out.println("something wrong");

        System.out.println(3.0/b); // Infinity
        System.out.println(0.0/b); // NaN
        System.out.println(0/b); // Runtime Error
        
    }
}

