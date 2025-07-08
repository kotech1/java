// Scope.java
public class Scope {
    public static void main(String[] args) {
        int a;

        {
            int a = 3;
            int b;
        }
        System.out.println(b);
    }
}


