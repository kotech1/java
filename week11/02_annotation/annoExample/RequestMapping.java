package annoExample;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.METHOD) // 메소드에 적용
@Retention(RetentionPolicy.RUNTIME) // 런타임까지 유지
public @interface RequestMapping {
    String uri();
}
