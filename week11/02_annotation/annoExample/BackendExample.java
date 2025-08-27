package annoExample;

import java.lang.reflect.Method;

public class BackendExample {
    public static void main(String[] args) {
        String path = "/login";

        UserController uc = new UserController();

        System.out.println(uc.getClass()); // 클래스 얻기

        // UserController의 모든 메소드를 얻어옴.
        Method[] methods = uc.getClass().getDeclaredMethods();

        for (Method m : methods) {
            // System.out.println(mt.getName()); 메소드 명칭
            // RequestMapping 애너테이션을 가져옴.
            RequestMapping anno = m.getAnnotation(RequestMapping.class);
            if (anno == null) continue; // RequestMapping 애너테이션 없음.

            if (anno.uri().equals(path))
                try {
                    m.invoke(uc);       // 해당 메소드 호출
                } catch (Exception e) { // 구체적 명시 필요
                    e.printStackTrace(); 
                }
        }
    }
}
