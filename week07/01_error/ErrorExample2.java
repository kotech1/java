// ErrorExample2.java
public class ErrorExample2 {
    Member2[] m;
    double[] meanRate;
    String[] grade;
    public void prepareData() {
        this.m = new Member2[] {
            new Member2("A", 10, 1),
            new Member2("B", 20, 2),
            new Member2("C", 1, 0),
        };
    }
    public void calcMeanRate() {
        this.meanRate = new double[m.length];
        for (int i = 0; i < m.length; i++) {
            meanRate[i] = (double)m[i].sum/m[i].nMonth;
        }
    }
    public void memberGrade() {
        this.grade = new String[m.length];
        for (int i = 0; i < m.length; i++) {
            if (m[i].name.equals("C")) {
                System.out.println((int)meanRate[i]); //2147483647
                System.out.println(meanRate[i]); //Infinity
            }
            grade[i] = (int)meanRate[i] >= 7 ? "Gold" : "Silver";
        }
    }
    public static void main(String[] args) {
        ErrorExample2 e = new ErrorExample2();
        e.prepareData();
        e.calcMeanRate();
        e.memberGrade();
    }
}

class Member2 {
    String name;
    long sum, nMonth;
    Member2(String name, int sum, int nMonth) {
        this.name = name;
        this.sum = sum;
        this.nMonth = nMonth;
    }
}
