// InheritanceExample1.java

class Animal {
    Animal() { System.out.println("Animal created"); }
     
    void eat() {
        System.out.println("Animal eats");
    }
}

class Mammal extends Animal {
    Mammal() { System.out.println("Mammal created"); }
    void walk() {
        System.out.println("Mammal walks");
    }
}

class Dog extends Mammal {
    Dog() { System.out.println("Dog created"); }
    void bark() {
        System.out.println("Dog barks");
    }
}

public class InheritanceExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();   // Grandparent 메서드
        dog.walk();  // Parent 메서드
        dog.bark();  // Child 메서드
    }
}
