// Devision.java
public class Devision {
    public static void main(String[] args) {
        System.out.println(9 / 2); // not 4.5
        System.out.println(1331 / 3); // not 443.6666666666667
        System.out.println(9.0 / 2); // 4.5
        System.out.println(9 / 2.0); // 4.5
        System.out.println(9 / 2.0); // 4.5
        System.out.println(9.0 / 2.0); // 4.5
        System.out.println(9 / 2d); // 4.5 double, 2d = 2.0 double
        System.out.println(9 / 2f); // 4.5 float
    }
}
