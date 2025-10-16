public class Quiz11 {
    public static void main(String[] args) {
        // 연습문제
        int[][][] a = new int[10][10][10];
        for (int k = 0; k < a.length; k++)
            for (int j = 0; j < a[k].length; j++)
                for (int i = 0; i < a[k][j].length; i++)
                    a[k][j][i] = 100*k + 10*j + i;
        for (int[][] b : a)
            for (int[] c : b)
                for (int d: c)
                    System.out.println(d);

        // 다차원 배열 이해하기
        int[][] b;  // b is an array of array of ints
        b = new int[3][]; // new array[3] of array of ints
        System.out.printf("%s\n", b[0]); // null

        b = new int[3][4]; // new array[3] of array[4] of ints
        System.out.println(b[2][3]); // 0

        //b = new int[][4]; // invalid

        String[][][] c; // c is an array of array of array of Strings
        c = new String[3][][]; // new array[3] of array of array of Strings
        c[0] = new String[4][]; // c[0] is an array[4] of array of Strings
        c[1] = new String[40][]; // c[1] is an array[40] of array of Strings
        System.out.println(c[2]); // null
        // System.out.println(c[0][39][0]); // invalid
        c[1][39] = new String[5]; // c[1][39] is an array[5] of Strings(null)
        System.out.println(c[1][39][0]); // null
        c[1][39][0] = "some string";

        c = new String[3][4][5]; // c is an array[3] of array[4] of array[5] of Strings(null)
        c[2][3][4] = "abc";

        // 비정형 크기 배열
        int [][][]d = { // d is an array[3] of array[*] of array[*] of ints
            { {1,2}, {3} }, // d[0] is an array[2] of array[*] of ints // what is d[0][1]?
            { {4}, {5}, {6,7} },
            { {8,9,10} },
        };
        System.out.println(d[2][0][1]); // 9
        System.out.println(d.length); // 3
        System.out.println(d[0].length); // 2
        System.out.println(d[1].length); // 3
        System.out.println(d[2].length); // 1
        System.out.println(d[0][0].length); // 2: {1,2}
        System.out.println(d[0][1].length); // 1: {3}

        for (int[][] e : d)
            for (int[] f: e)
                for (int g: f)
                    System.out.printf("%d ", g);
        System.out.print("\n");
    }
}
