package listexample;
import java.util.*;

class User {
    long id;
    String name;
    String email; //optional
    User(long id, String name) {
        this.id = id; this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof User u)) return false;
        
        return this.id == u.id && this.name.equals(u.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
public class ListExample2 {
    public static void main(String[] args) {
        List<User> l = new ArrayList<>(); // JDK7+
        l.add(new User(1001, "홍길동"));
        l.add(new User(1002, "김영희"));

        // true or false?
        System.out.println("홍길동 포함? "
            + l.contains(new User(1001, "홍길동"))); 
        l.remove(new User(1001, "홍길동"));
        l.forEach((u) -> System.out.println(u.name));
        //User a = l.get(0);
        //System.out.println(a.hashCode());
    }
}
