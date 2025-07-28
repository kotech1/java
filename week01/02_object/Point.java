// Point.java
public class Point {
    public int x, y;

    /* 좌표를 지정하는 생성자 */
    public Point(int x, int y) {
        this.x = x; this.y = y;
    }

    /* 다른 Point의 값을 현재 객체(this)에 복사 */
    public void copyFrom(Point other) {
        this.x = other.x; this.y = other.y;
    }

    /* 테스트용 메인 */
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);    // 원본
        Point p2 = new Point(0, 0);        // (0,0)

        p2.copyFrom(p1);               // p1 값을 p2에 복사
        System.out.println(p2.x + ", " + p2.y); // → 3, 4
    }
}

