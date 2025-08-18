// Scope.java
public class Scope {
    public static void main(String[] args) {
        int a;
        a = 1;
        {
            //int a = 3; //error
            int b = 0;
            System.out.println(a); // OK
            System.out.println(b); // OK
        }
        System.out.println(a); // OK
        //System.out.println(b); // error
    }
}


