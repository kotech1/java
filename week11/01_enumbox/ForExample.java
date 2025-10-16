public class ForExample {
    public static void main(String[] args) {
        {
            int[] arr = { 1, 2, 3, 4 }; 
            for (int i = 0; i < arr.length; i++) {
                int x = arr[i];
                System.out.println(x);
            }
            for (int x : arr)
                System.out.println(x);
        }

        {
            int[][] b;
            b = new int[3][];
            System.out.printf("%s\n", b[0]); // null
        }
        {
            int b[][];
            b = new int[3][4];
            System.out.println(b[2][3]); // 0
        }
    }
}
