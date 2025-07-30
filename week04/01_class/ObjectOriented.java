// ObjectOriendted.java

public class ObjectOriented {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.makeSound(); // Bark!
    }
}

class Account {
    private int balance;

    public void deposit(int amount) {
        if (amount > 0) balance += amount;
    }

    public int getBalance() { // getter 
        return balance;
    }
}

class Animal {
    void move() { System.out.println("Moving"); }
    void makeSound() { System.out.println("???"); }
}

class Bird extends Animal {
    void fly() { System.out.println("Flying"); }
    void makeSound() { System.out.println("Tweet!"); }
}

class Dog extends Animal {
    void makeSound() { System.out.println("Bark!"); }
}

abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;
    double area() { return Math.PI * radius * radius; }
}
