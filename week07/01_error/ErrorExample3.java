// ErrorExample3.java
public class ErrorExample3 {
    Member3[] m;
    double[] meanRate;
    String[] grade;
    public void prepareData() {
        this.m = new Member3[] {
            new Member3("A", 10, 1),
            new Member3("B", 20, 2),
            new Member3("C", 1, 0),
        };
    }
    public void calcMeanRate() {
        this.meanRate = new double[m.length];
        for (int i = 0; i < m.length; i++) {
            meanRate[i] = (double)m[i].sum/m[i].nMonth;
        }
    }
    final static String[] gradeRule = {
        "Silver", "Silver", "Silver", "Silver", 
        "Silver", "Silver", "Silver",
        "Gold", "Gold", "Gold", "Gold", // 0..10
    };
    public void memberGrade() {
        this.grade = new String[m.length];
        for (int i = 0; i < m.length; i++) {
            grade[i] = gradeRule[(int)meanRate[i]];
            System.out.println(grade[i]);
        }
    }
    public static void main(String[] args) {
        ErrorExample3 e = new ErrorExample3();
        e.prepareData();
        e.calcMeanRate();
        e.memberGrade();
    }
}

class Member3 {
    String name;
    long sum, nMonth;
    Member3(String name, int sum, int nMonth) {
        this.name = name;
        this.sum = sum;
        this.nMonth = nMonth;
    }
}
