class A extends Exception {
}

class B extends A { 
}

public class Quiz07 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(3/0);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("AAA");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            int a = 0;
            if (a == 0)
                throw new B();
            else
                throw new A();
        } catch (B e) {
            System.out.println("B Exception");
        } catch (A e) { 
            System.out.println("A Exception");
        }
    }
}


