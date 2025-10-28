import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        //ArrayList<String> l = new ArrayList<String>();
        List<String> l = new ArrayList<>(); // JDK7+ 중복 타입 생략
        l.add("서울");
        l.add("부산");
        l.add("대전");
        l.add("대전");
        System.out.println(l); //[서울, 부산, 대전, 대전]
        System.out.println("대전이 포함? "
            + l.contains("대전")); 
        l.remove("대전"); 
        //List<String> l2 = (ArrayList<String>)l.clone();
        List<String> l2 = new ArrayList<String>(l);
        l2.add("광주");
        l.addAll(l2);
        //[서울, 부산, 대전, 서울, 부산, 대전, 광주]
        System.out.println(l);
        l.removeAll(l2);
        System.out.println(l);
    }
}
