// Interface1.java

interface Animal5 {
    void eat();
}

interface Mammal5 extends Animal5 {
    void sound();
}

class Dog5 implements Mammal5 {
    Dog5() { }
    @Override // 컴파일 시 메소드 확인
    public void eat() {
        System.out.println("Dog eats");
    }
    @Override // 컴파일 시 메소드 확인
    public void sound() {
        System.out.println("Bark");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Dog5 dog = new Dog5();
        dog.eat();   // Dog eats
        dog.sound(); // Bark
    }
}
