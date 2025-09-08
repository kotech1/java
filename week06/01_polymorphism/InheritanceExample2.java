// InheritanceExample2.java

class Animal2 {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog2 extends Animal2 {
    @Override // 재정의
    void sound() {
        System.out.println("Bark");
    }
}

public class InheritanceExample2 {

    static boolean condition() {
        return false;
    }
    static void playDogSound(Animal2 a) {
        Dog2 d = (Dog2)a; // 런타임 오류 가능성
        d.sound();
        /*
        if (a instanceof Dog2 d) {
            d.sound();
        }
        */
        /*
        컴파일러가 컴파일 당시 모든 조건에 대해 추적할 수 있을 경우 패턴 매칭 변수는 존재할 수 있다.
        */
        /*
        {
            if (!(a instanceof Dog2 d)) {
                return;
            }
            d.sound();
        }
        {
            boolean b = true;
            if (!(a instanceof Dog2 d) && b)
                return;
            //d.sound(); // 컴파일 오류
        }
        {
            if (!(a instanceof Dog2 d) || condition())
                return;
            d.sound(); // OK
        }
        {
            if (!(a instanceof Dog2 d)) {

            } else {
                d.sound(); // OK
            }
            //d.sound(); // 컴파일 오류

        }
        */
    }

    static void playSound(Animal2 a) {
        a.sound();
    }

    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.sound();   // Bark

        Animal2 animal = dog;       // 업캐스팅 항상 가능
        animal.sound();             // Bark -> 다형성
        
        Dog2 oldDog = (Dog2)animal; // 다운 캐스팅
        oldDog.sound();             // Bark

        Animal2 newAnimal = new Animal2();
        newAnimal.sound();          // Animal sound
        //Dog2 newDog = (Dog2)newAnimal; // 컴파일 오류
        playDogSound(oldDog);       // Bark
        playDogSound(animal);       // Bark
        //playDogSound(newAnimal);  // 런타임 오류
        playSound(oldDog);          // Bark
        playSound(newAnimal);       // Animal sound

    }
}
