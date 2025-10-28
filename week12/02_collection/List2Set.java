import java.util.*;

class User {
    String name;
    int id;
    String email;

    public User(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    // equals & hashCode : name과id기준으로 중복 판단
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return id == user.id && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "User(" + id + ", " + name + ", " + email + ")";
    }
}

public class List2Set {
    public static void main(String[] args) {
        // List<User> 준비 (중복 포함)
        List<User> users = new ArrayList<>();
        users.add(new User("홍길동", 1, "hong@example.com"));
        users.add(new User("김영희", 2, "kim@example.com"));
        users.add(new User("홍길동", 1, "zzz@example.com")); // name/id 중복
        users.add(new User("이철수", 3, "lee@example.com"));

        // List → Set 변환 (중복 제거)
        Set<User> uniqueUsers = new HashSet<>(users);

        System.out.println("\n중복 제거된 Set:");

        // List는 Iterable을 구현하므로 iterator() 사용 가능
        Iterable<String> iterable = Arrays.asList("A", "B", "C");

        Iterator<String> it = iterable.iterator();

        while (it.hasNext()) {
            String lang = it.next();
            System.out.println(lang);
        }

        for (User u : uniqueUsers) // 향상된 for 문
            System.out.println(u);

        uniqueUsers.forEach((u) -> System.out.println(u)); // 람다  메소드

        uniqueUsers.forEach(System.out::println); // 메소드 레퍼런스
    }
}

