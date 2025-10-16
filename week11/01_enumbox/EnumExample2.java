enum MyDay {
    SUN("일요일"), 
    MON("월요일"), 
    TUE("화요일"), 
    WED("수요일");

    private final String label;  // 커스텀 문자열 필드

    MyDay(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}

public class EnumExample2 {
    public static void main(String[] args) {
        System.out.println(MyDay.MON.name());   // "MON" 
        System.out.println(MyDay.MON.getLabel()); // "월요일" (사용자가 정의한 문자열)

        int day = 2;    // ordinal로 enum객체 얻기
        MyDay[] days = MyDay.values(); // 전체를 배열로
        MyDay d = days[day];           // 배열의 index로 객체 선정
        System.out.println(d.getLabel()); // "화요일"
    }
}
