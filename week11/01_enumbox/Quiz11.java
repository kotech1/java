public class Quiz11 {
    public static void main(String[] args) {
        int[][][] a = new int[10][10][10];
        for (int k = 0; k < a.length; k++)
            for (int j = 0; j < a[k].length; j++)
                for (int i = 0; i < a[k][j].length; i++)
                    a[k][j][i] = 100*k + 10*j + i;
        for (int[][] b : a)
            for (int[] c : b)
                for (int d: c)
                    System.out.println(d);
    }
}
