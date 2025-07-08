// Mean.java
public class Mean {
    public static void main(String[] args) {
        int[] monthly = { 4, 5, 1, 3, 4, 5, 2, 5, 7, 8, 9, 3 };
        int nMonth = monthly.length; // 12

        double sum = 0;
        
        for (int i = 0; i < nMonth; i++) {
            sum += monthly[i];
        }

        double mean = sum/nMonth; 

        System.out.println("mean = " + mean); // mean = 4.666666666666667
    }
}


