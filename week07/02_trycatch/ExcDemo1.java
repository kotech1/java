// ExcDemo1.java
public class ExcDemo1 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        try {
            System.out.println("예외 발생 전");
            arr[7] = 10;
            System.out.println("예외 발생 후");
        } catch (Exception e) {
            System.out.println("예외 발생");
            System.out.println(e.getMessage());
        }

        try {
            arr[7] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            // 특정 예외 처리
            System.out.println("배열 오류");
        } catch (Exception e) {
            // 나머지 오류 
            System.out.println(e.getMessage());
        }
        try {
        } catch (ArithmeticException exc) {
            // catch the exception
        } catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
        } finally {
            System.out.println("항상 실행");
        }
    }
}
