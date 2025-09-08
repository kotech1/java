abstract class Animal7 {
    protected String name; // 부모 이름

    public Animal7(String name) {
        this.name = name;
    }

    protected abstract void sound(); 

    public void eat() {
        System.out.println(name + " is eating.");
    }
    /*
    public String getName() {
        return this.name;
    }
    */
}

class Dog7 extends Animal7 {
    protected String name; // 자식 이름 --> 새도잉
    public Dog7(String name) {
        super("Animal"); // super()는 항상 처음에 위치
        this.name = name;
    }
    @Override
    protected void sound() {
        System.out.println(this.name + " sound");
        System.out.println(((Animal7)this).name + " sound");
        //System.out.println(getName()); // same as this.getName();
        //System.out.println(super.getName());
    }
    /*
    @Override
    public String getName() {
        return this.name;
    }
    public String getSuperName() {
        return super.getName();
    }
    */
}

public class AbstractClass {
    public static void main(String[] args) {
        Dog7 d = new Dog7("바둑이");
        d.sound();
        //System.out.println(((Animal7)d).getName()); // 바둑이
    }
}
