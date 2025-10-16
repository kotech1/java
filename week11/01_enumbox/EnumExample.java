enum Day {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

public class EnumExample {
    public static void main(String[] args) {
        Day today = Day.MON;

        // 출력
        System.out.println(today);            // MON
        System.out.println(today.ordinal());  // 0 
        System.out.println(today.name());     // MON
        Day tomorrow = Day.valueOf("TUE");
        System.out.println(tomorrow);         // TUE

        // switch문과 잘 어울림
        switch (today) {
            case MON:
                System.out.println("월요일");
                break;
            case TUE:
                System.out.println("화요일");
                break;
            default:
                System.out.println("나머지 요일");
        }
    }
}
