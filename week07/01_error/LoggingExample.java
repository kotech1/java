//import java.util.logging.*;
import java.util.logging.Logger;
import java.util.logging.Level;

public class LoggingExample {
    // 동적 메소드, 변수에서는 클래스 이름에 this.getClass() 사용가능
    private static final Logger logger = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.INFO);
        logger.info("정보 메시지입니다.");
        logger.warning("경고 메시지입니다.");
    }
}

