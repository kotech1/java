public class ForExample {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 }; 
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            System.out.println(x);
        }
        for (int x : arr)
            System.out.println(x);
    }
}
