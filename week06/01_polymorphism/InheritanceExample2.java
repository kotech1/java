// InheritanceExample2.java

class Animal2 {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog2 extends Animal2 {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

public class InheritanceExample2 {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.sound();   // Bark
    }
}
