// Mean2.java
public class Mean2 {
    public static void main(String[] args) {
        int[] monthly = { 4, 5, 1, 3, -1, 5, 2, 5, 7, 8, 9, 3 };
        int nMonth = monthly.length; // 12
        int n = nMonth;

        double sum = 0;
        
        for (int i = 0; i < nMonth; i++) {
            if (monthly[i] < 0) {
                 n--;
                 continue;
            }
            sum += monthly[i];
        }
        double mean = sum/n;

        System.out.println("mean = " + mean); // sum = 13.0
    }
}


