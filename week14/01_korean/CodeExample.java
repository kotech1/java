import static java.lang.System.out;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;

class CodeExample {
    public static void main(String[] args) throws Exception {
        String s = "0Aa\r\n";
        out.printf("0x%02x\n", (int)s.charAt(0)); // 0x30
        out.printf("0x%02x\n", (int)s.charAt(1)); // 0x41
        out.println((char)(s.charAt(1)+1)); // B
        out.printf("0x%02x\n", (int)'\r'); // 0x0d CR=carriage return
        out.printf("0x%02x\n", (int)'\n'); // 0x0a LF=line feed

        s = "가각";
        out.printf("0x%02x\n", (int)s.charAt(0)); // 0xac00
        out.printf("0x%02x\n", (int)s.charAt(1)); // 0xac01

        String text = "안녕하세요\n";
        // UTF-8로 파일 저장
        try (Writer writer = new OutputStreamWriter(
                new FileOutputStream("utf8.txt"),
                StandardCharsets.UTF_8)) {
            writer.write(text);
        }

        // EUC-KR로 파일 저장
        try (Writer writer = new OutputStreamWriter(
                new FileOutputStream("euckr.txt"),
                "EUC-KR")) {
            writer.write(text);
        }
        //String s = "가😀";
        s = "가😀";
        for (int i = 0; i < s.length(); i++)
            System.out.println(s.charAt(i));
        System.out.println(s.codePoints().count());
        s.codePoints().forEach(cp -> System.out.println(Character.toChars(cp)));
        int secondChar = s.codePoints().toArray()[1];
        String second = new String(Character.toChars(secondChar)); // 😀
        System.out.println(second);

        String ga = "가";     // U+AC00

        // NFD (분해형)
        String gaNFD = Normalizer.normalize(ga, Normalizer.Form.NFD);

        // NFC (합성형)
        String gaNFC = Normalizer.normalize(ga, Normalizer.Form.NFC);

        System.out.println("문자열 : " + ga);
        System.out.println("NFD 코드: " + toCodePoints(gaNFD));
        System.out.println("NFC 코드: " + toCodePoints(gaNFC));
        System.out.println("NFD 출력: " + gaNFD);
        //System.out.println(gaNFD.getBytes().length);
        //System.out.write(gaNFD.getBytes());
    }

    // 유니코드 코드포인트를 보기 좋게 출력하는 메소드
    private static String toCodePoints(String input) {
        String s = "";
        for (int cp : input.codePoints().toArray())
            s += String.format("U+%04X ", cp);

        return s.trim();
    }
}
