// Sum2.java
public class Sum2 {
    public static void main(String[] args) {
        int[] monthly = { 4, 5, 1, 3, -1, 5, 2, 5, 7, 8, 9, 3 };
        int nMonth = monthly.length; // 12

        double sum = 0;
        
        for (int i = 0; i < nMonth; i++) {
            if (monthly[i] < 0)
                break;
            sum += monthly[i];
        }

        System.out.println("sum = " + sum); // sum = 13.0
    }
}


