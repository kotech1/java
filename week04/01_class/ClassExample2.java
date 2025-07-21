// ClassExample2.java

public class ClassExample2 {
    public static void main(String[] args) {
        Club2 a = new Club2(1, 10);
        //Club2 d = new Club2(); // compile error
        System.out.println("id = "+a.id+", nMembers = "+a.nMembers);
        System.out.println("money = "+a.money);

        Club2 b = new Club2(1, 10);
        System.out.println(a == b);
        Club2 c = a;
        System.out.println(a == c);

        a.setId(7);
        System.out.println(a.getId());
    }
}

class Club2 extends Object {
    int id;
    int nMembers;
    double money = 100.0;

    //Club2() { }
    Club2(int id, int nMembers) {
        this.id = id;
        this.nMembers = nMembers;
    }

    public int getId() { // getter
        return this.id;
    }
    public void setId(int id) { // setter
        this.id = id;
    }

}
