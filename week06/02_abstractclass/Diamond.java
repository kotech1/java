interface A {
    default void hello() {
        System.out.println("A hello");
    }
}

interface B extends A {
    // void funcB();
}

interface C extends A {
    // void funcC();
}

class D implements B, C {
}

public class Diamond {
    public static void main(String[] args) {
        D d = new D();
        d.hello();
    }
}
