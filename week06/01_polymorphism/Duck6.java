
interface Animal6 {
    void move();
}

public class Duck6 implements Animal6 {
    public void move() {
        System.out.println("오리가 걷습니다");
    }
    public void fly() {
        System.out.println("오리가 납니다");
    }
    public static void main(String[] args) {
        Animal6[] a = {new Duck6(), new Duck6()};
        a[0].move(); 
        //a[1].fly();
    }
}

