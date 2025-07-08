// Mean3.java
public class Mean3 {
    public static void main(String[] args) {
        int[] monthly = { 4, 5, 1, 3, -1, 5, 2, 5, -2, 8, 9, 3 };
        int nMonth = monthly.length; // 12
        int n = 0;

        double sum = 0;
        
        for (int i = 0; i < nMonth; i++) {
            if (monthly[i] == -1)
                 continue;
            else if (monthly[i] == -2)
                 break;
            sum += monthly[i];
            n++;
        }
        double mean = sum/n;

        System.out.println("mean = " + mean); // mean = 2.272727272727273
    }
}


