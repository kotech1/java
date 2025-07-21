// is-a 관계
class Machine {
    void start() {
        System.out.println("가동 시작");
    }
}

// has-a 관계
class Battery {
    void supplyPower() {
        System.out.println("전원 공급");
    }
}

// can-do 관계: 기능 인터페이스
interface Speakable {
    void speak(String message);
}

interface Movable {
    void move(int distance);
}

// 세 관계 혼합
public class SmartRobot extends Machine implements Speakable, Movable {
    Battery battery;  // has-a 관계

    public SmartRobot() {
        this.battery = new Battery();  // 조합
    }

    @Override
    public void speak(String msg) {
        System.out.println("말하기: " + msg);
    }

    @Override
    public void move(int distance) {
        System.out.println("이동:" + distance + " 미터");
    }

    void operate() {
        battery.supplyPower(); // has-a 사용
        start();               // is-a 사용
        speak("안녕하세요!");     // can-do 사용
        move(10);              // can-do 사용
    }

    public static void main(String[] args) {
        SmartRobot robot = new SmartRobot();
        robot.operate();
    }
}


public class Person {
    private String name;         
    private String birthDate;    
    // setter 메소드
    public void setInfo(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
}
Person p = new Person();
p.setInfo("난 니꺼♥️", "4141-13-32");