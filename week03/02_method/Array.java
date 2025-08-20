// Array.java
class Array {
    public static void main(String[] args) {
    {
        int[] a = new int[10];

        int[] b;
        b = new int[10];
        a[0] = b[0];
        b[1] = a[0];

        int[] c = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(c);
        System.out.println(c[3]);
        String[] weekend = {
            "토요일", "일요일"
        };
        System.out.println(weekend);
        System.out.println(weekend[0]);
    }
    {
        int[] a = {1};
        int[] b = a; // copy of reference
        a[0] = 99;
        System.out.println(a);
        System.out.println(b);
        System.out.println(b[0]); // 99
    }
    {
        int a = 1;
        int b = a; // copy of value
        a = 99;
        System.out.println(b); // 1
    }
    {
        int[][] a = {
            { 1, 2, 3},
            { 4, 5},
            { 6, 7, 8}
        };
        System.out.println(a[2][1]);

        a[1] = null;
        System.out.println("a[0] = "+a[0]+", a[1] = "+a[1]+", a[2] = "+a[2]);
    }
    {
        // 주로 행,열의 순서로 사용
        int[][] a = new int[1080][1920];
        int i = 423, j = 123;
        a[j][i] = 1;
    }
    }
}

