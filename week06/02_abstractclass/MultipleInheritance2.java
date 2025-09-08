interface B2 {
    default void hello() {
        System.out.println("B.hello");
    }
}

interface C2 {
    default void hello() {
        System.out.println("C.hello");
    }
}

// A와 B 모두 hello()를 제공하므로 충돌 → 반드시 재정의 필요
class D2 implements B2, C2 {
    @Override
    public void hello() {
        // 원하는 쪽을 골라 호출하거나, 둘 다 호출한 뒤
        // 자신만의 로직을 추가할 수도 있다.
        B2.super.hello(); // B2.hello
        C2.super.hello(); // C2.hello
        System.out.println("D.hello");
    }
}

public class MultipleInheritance2 {
    public static void main(String[] args) {
        new D2().hello();
        /* 위 문법은 아래와 유사하다.
         * 따라서 new D2()는 괄호가 필요없이 하나의 표현식이 된다.
         * new int[10] 등의 생성도 마찬가지다.
        d = new D2();
        d.hello();
         */
    }
}
