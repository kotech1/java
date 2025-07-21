// StaticExample.java

public class StaticExample {
    public static void main(String[] args) {
        System.out.println(Club3.id);
        Club3.id++;
        Club3 a = new Club3();
        a.id++;
        System.out.println(Club3.id);
        a.setValues(9, 99);
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
        this.id = id;
        this.nMembers = nMembers;
    }
}
