import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    private final String name;
    private final int age;

    @JsonCreator
    public Person(@JsonProperty("name") String name, @JsonProperty("age") int age) {
        this.name = name;
        this.age = age;
    }

    // Getter (역직렬화를 위해 필요)
    public String getName() { return name; }
    public int getAge() { return age; }
}
