// Vararg.java
class Vararg {
    static int sum1(int[] a) {
        int sum = 0;
        for (int i = 0; i <= a.length; i++)
            sum += i;
        return sum;
    }
    static int sum2(int ... a) {
        int sum = 0;
        for (int i = 0; i <= a.length; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};
        System.out.println(sum1(a));
        System.out.println(sum2(1,2,3));
    }
}

