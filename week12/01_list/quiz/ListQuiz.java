package quiz;
import java.util.*;

public class ListQuiz {
    static double sum(List<?> ls) {
        double sum = 0.0;
        for (Object o : ls) 
            sum += ((Number)o).doubleValue();
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(3, 4);
        //List<String> ls = Arrays.asList("1.0", "1.1");
        System.out.println(sum(ls));
    }
}
