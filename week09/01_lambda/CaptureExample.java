// CaptureExample.java
import java.util.function.Supplier;

public class CaptureExample {
    public static void main(String[] args) {
        Supplier<String> f;
        {
            Person p = new Person("홍길동");
            f = p::getName; // 객체 캡쳐
        }
                
        //String s = p.getName(); // 컴파일 오류
        System.out.println(f.get());
    }
}

class Person {
    String name;
    Person(String name) { this.name = name; }
    String getName() { return name; }
}
