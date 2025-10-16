public class BoxExample3 {
    static void setDouble(Double a) {
    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // 메소드 호출 시 오토박싱
        double a = 3.14;
        setDouble(a);     // autobox
        Double b = 0.1;
        a = Math.sqrt(b); // auto-unbox

        Integer iOb = Integer.valueOf(99);
        iOb += 1;         // unbox -> 정수연산 -> box
        ++iOb;            // unbox -> 정수연산 -> box

        Integer iOb2 = 3, iOb3 = 0;
        iOb3 = iOb + iOb2/2; // unbox 2회 -> 정수연산 -> box
    }
}
