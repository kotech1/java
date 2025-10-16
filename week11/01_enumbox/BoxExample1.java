class Dog { }
public class BoxExample1 {
    public static void main(String[] args) {
        Object[] arrObj = {
            "가나다",
            new Dog(),
            Dog.class, // 클래스 리터럴(정의 메타데이터)
            new int[100],
            new Runnable() { public void run(){} },
            (Runnable) () -> {},
            null,
            0xffff,
            3.14
        };
        for (Object obj : arrObj) {
            if (obj == null) continue;
            System.out.println("\nFull name: " + obj.getClass().getName());
            System.out.println("Simple name: " + obj.getClass().getSimpleName());
        }
    }
}
