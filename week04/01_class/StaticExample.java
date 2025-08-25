// StaticExample.java

public class StaticExample {
    public static void main(String[] args) {
        System.out.println(Club3.id);
        Club3.id++;
        Club3 a = new Club3();
        //a.id++;     // OK 
        Club3.id++;   //가독성
        System.out.println(Club3.id);
        a.setValues(9, 99);
        System.out.println(Club3.id);
    }
}

class Club3 extends Object {
    static int id = 3;
    int nMembers;
    static void setId(int id) {
        Club3.id = id;
        // this.id = id; // compile error
    }
    public void setValues(int id, int nMembers) {
        // this.id = id;  // OK
        Club3.id = id; // 가독성(정적변수 명시)
        this.nMembers = nMembers;
    }
}
