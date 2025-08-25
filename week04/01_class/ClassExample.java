// ClassExample.java

public class ClassExample {
    public static void main(String[] args) {
        Club a = new Club();
        //Club b = new Club();
        int id = a.id;  // 값 읽기
        a.id = ++id;    // 값 쓰기
        id = a.getId(); // 메소드 호출
        System.out.println("id = "+a.id+", nMembers = "+a.nMembers);
    }
}
