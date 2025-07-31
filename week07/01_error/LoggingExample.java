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


/*
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private static final Logger logger = LoggerFactory.getLogger(MyService.class);

    public void doSomething() {
        logger.info("정보 로그 출력");
        logger.debug("디버그 로그 출력");
        logger.error("오류 로그 출력");
    }
}
*/