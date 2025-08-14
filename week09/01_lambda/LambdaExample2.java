// LambdaExample2.java
public class LambdaExample2 {
    public static void main(String[] args) {
        EggPlate f = (eggs) -> {
            return (eggs + EggPlate.MAXCOUNT-1)/EggPlate.MAXCOUNT;
        };
        System.out.println(f.count(0));  // 0
        System.out.println(f.count(1));  // 1
        System.out.println(f.count(30)); // 1
        System.out.println(f.count(31)); // 2
    }
}

@FunctionalInterface
interface EggPlate {
    int MAXCOUNT = 30;
    int count(int eggs); 
}

