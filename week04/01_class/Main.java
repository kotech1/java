import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws Exception {
        String json = "{\"name\": \"홍길동\", \"age\": 30}";

        ObjectMapper mapper = new ObjectMapper();
        Person person = mapper.readValue(json, Person.class);

        System.out.println(person.getName()); // 홍길동
        System.out.println(person.getAge());  // 30
    }
}
