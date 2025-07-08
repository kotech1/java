// DoWhile.java
public class DoWhile {
    public static void main(String[] args) {
        double temperature;

        do {
            // 온도계산 (실제로는 30도의 sin 값 계산방법)
            double degree = 30.0; // 각도 입력
            double radians = Math.toRadians(degree); // 라디안으로 변환
            double sinValue = Math.sin(radians); // 사인값 계산
            temperature = sinValue;
        } while (temperature >= 30.); 
    }
}


