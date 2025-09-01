interface Animal2 {
    void sound();
}

class Dog2 implements Animal2 {
    public void sound() {
        System.out.println("멍멍! 🐶");
    }
}

class Cat2 implements Animal2 {
    public void sound() {
        System.out.println("야옹~ 🐱");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) { 
        Animal2 a1 = new Dog2();
        Animal2 a2 = new Cat2();

        a1.sound();  // 출력: 멍멍!
        a2.sound();  // 출력: 야옹~
    }
}
