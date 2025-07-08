import java.util.Scanner;

public class GradeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요 (0~100): ");
        int score = sc.nextInt();

        char grade;              // 학점 변수

        if (score >= 90) {               // 90~100
            grade = 'A';
        } else if (score >= 80) {        // 80~89
            grade = 'B';
        } else if (score >= 70) {        // 70~79
            grade = 'C';
        } else if (score >= 60) {        // 60~69
            grade = 'D';
        } else {                        // 0~59
            grade = 'F';
        }

        System.out.printf("점수: %d → 학점: %c%n", score, grade);
        sc.close();

        String sGrade;
        if (score >= 90)                
            sGrade = "A";
        else if (score >= 80)           
            sGrade = "B";
        else if (score >= 70)           
            sGrade = "C";
        else if (score >= 60)           
            sGrade = "D";
            if (score >= 65)            // maybe a bug
                sGrade = "D+";
        else                            
            sGrade = "F";

        System.out.printf("점수: %d → 학점: %s%n", score, sGrade);

    }
}
