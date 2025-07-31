
public class ErrorExample1 {
    Member1[] m;
    long[] meanRate;
    public void prepareData() {
        this.m = new Member1[] {
            new Member1("A", 100, 1),
            new Member1("B", 200, 2),
            new Member1("C", 10, 0),
        };
    }
    public void calcMeanRate() {
        this.meanRate = new long[m.length];
        for (int i = 0; i < m.length; i++) {
            meanRate[i] = m[i].sum/m[i].nMonth;
        }
    }
    public static void main(String[] args) {
        ErrorExample1 e = new ErrorExample1();
        e.prepareData();
        e.calcMeanRate();
    }
}

class Member1 {
    String name;
    long sum, nMonth;
    Member1(String name, int sum, int nMonth) {
        this.name = name;
        this.sum = sum;
        this.nMonth = nMonth;
    }
}
