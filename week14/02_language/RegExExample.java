import java.util.regex.*;
import java.util.*;

public class RegExExample {
    public static void main(String[] argv) {
{
        Pattern p = Pattern.compile("(?U)(\\w+)\\s+(\\d+)");
        Matcher m = p.matcher("foo 123 바 456");
        while (m.find()) // 캡쳐 그룹
            System.out.println(m.group(1) + " -> " + m.group(2)); 

        // 그룹 재배치 치환
        String out = m.replaceAll("$2<$1>"); // "123<foo> 456<바>"
        System.out.println(out);
}
{
        String s = "user=홍길동&pass=gil&email=mail@example.com";
        Map<String, String> map = new HashMap<>();
        Pattern p = Pattern.compile("([^&=]+)=([^&]*)");
        Matcher m = p.matcher(s);
        while (m.find())
            map.put(m.group(1), m.group(2));
        System.out.println(map);
        // {pass=gil, user=홍길동, email=mail@example.com}
}
{
        Pattern p = Pattern.compile("(?U)(\\w+)de(\\w+)");
        Matcher m = p.matcher("abcdefghi");
        while (m.find())
            System.out.println(m.group(2));
}
    }
}
