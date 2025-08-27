package annoExample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BackendExample {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        String path = "/login";

        UserController uc = new UserController();

        System.out.println(uc.getClass()); // 클래스 얻기

        // UserController의 모든 메소드를 얻어옴.
        Method[] methods = uc.getClass().getDeclaredMethods();

        for (Method mt : methods) {
            // System.out.println(mt.getName()); 메소드 명칭
            RequestMapping anno = mt.getAnnotation(RequestMapping.class);
            if (anno == null) continue; // RequestMapping 애너테이션 없음.

            if (anno.uri().equals(path))
                mt.invoke(uc);
        }
    }
}
