import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요일 번호를 입력하세요 (1=월, 2=화,..., 7=일): ");
        int day = sc.nextInt();

        // 1. 전통적인 switch 문
        String type;
        switch (day) {
            case 1: case 2: case 3: case 4: case 5:
                type = "평일";
                break;
            case 6: case 7:
                type = "주말";
                break;
            default:
                type = "잘못된 입력";
        }
        System.out.println("switch: " + type);

        // 2 switch 식(Java 14+) – 값 반환용
        String type2 = switch (day) {
            case 1, 2, 3, 4, 5 -> "평일";
            case 6, 7         -> "주말";
            default           -> "잘못된 입력";
        };
        System.out.println("switch 식: " + type2);
        sc.close();
    }
}
