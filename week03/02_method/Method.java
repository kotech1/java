// Method.java
class Method {
    public static void main(String[] args) {
        int a;
        a = Functions.factorial(3);
        System.out.println(a);
    }
}

class Functions {
    static int factorial(int n) {
        int prod = 1;
        for (int i = 1; i <= n; i++)
            prod *= i;
        return prod;
    }
}
