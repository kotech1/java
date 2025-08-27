package annoExample;

//@Controller 스프링 프레임워크의 경우
public class UserController {
    // 예: https://example.com/login  처리
    @RequestMapping(uri = "/login")
    public void login() {
        System.out.println("login 페이지 or API");
    }

    @RequestMapping(uri = "/userinfo")
    public void userinfo() {
        System.out.println("userinfo 페이지 or API");
    }

    //@RequestMapping(uri = "/logout")
    public void logout() {
        System.out.println("logout 처리 or API");
    }
}
