package quiz;

// 퀴즈1 보기1
interface A {
    default void hi() {
    }
}
interface B {
    default void hi() {
    }
}
class C implements A, B {
    // ...
    public void hi() { A.super.hi(); }
}
/* 
*/

/*
// 퀴즈1 보기2
interface A {
    default void hi() {
    }
}
interface B {
    void hi();
}
class C implements A, B {
    // ...
    // public void hi() { A.super.hi(); }
}
*/

/*
// 퀴즈1 보기3
interface A {
    void hi();
}
interface B {
    void hi();
}
class C implements A, B {
    public void hi() {
    }
}
*/

/*
// 퀴즈1 보기4
interface A {
    default void hi() {
    }
}

interface B {
    default void hi(int a) {
    }
}

class C implements A, B {
    // ...
}
*/

/*
// 퀴즈2
interface A {
    default void hi() {   // default 메소드
        System.out.println("A hi");
    }
}

interface B {
    void hi();            // 추상 메소드
    default void hi(int a) { // 메소드 시그니쳐 다름
        System.out.println(a);
    }
}

class C implements A, B {
    public void hi() {
        A.super.hi();
    }
}
*/

public class Quiz6 {
    public static void main(String[] args) {
        C c = new C();
        c.hi();
        //c.hi(3);
    }
}
