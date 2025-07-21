// MultipleInheritance1.java
interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

interface GPS {
    void navigate(String destination);
}

// SmartPhone은 여러 기능을 동시에 가져야 한다.
class SmartPhone implements Camera, MusicPlayer, GPS {
    @Override
    public void takePhoto() {
        System.out.println("사진을 찍습니다.");
    }

    @Override
    public void playMusic() {
        System.out.println("음악을 재생합니다.");
    }

    @Override
    public void navigate(String destination) {
        System.out.println(destination + "로 길 안내를 시작합니다.");
    }
}
public class MultipleInheritance1 {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.takePhoto();               // 📸 사진 기능
        phone.playMusic();               // 🎵 음악 기능
        phone.navigate("서울역");        // 🗺️ GPS 기능
    }
}
