// InheritanceExample3.java

class Animal3 {
    Animal3(String name) {
        System.out.println("Animal "+name);
    }
    void sound() { System.out.println("Animal sound"); }
}

class Dog3 extends Animal3 {
    Dog3(String name) {
        super(name);
        System.out.println("Dog3 "+name);
    }
    @Override
    void sound() {
        super.sound();
        System.out.println("Bark");
    }
}

public class InheritanceExample3 {
    public static void main(String[] args) {
        Dog3 dog = new Dog3("Jjong");
        dog.sound(); 
    }
}
