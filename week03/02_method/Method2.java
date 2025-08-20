// Method2.java
class Method2 {
    public static void main(String[] args) {
        int a;
        a = Functions2.factorial(30000);
        System.out.println(a);
    }
}

class Functions2 {
    static int factorial(int n) {
        if (n == 1)
            return 1;
        else
            return n * factorial(n-1);
    }
}
