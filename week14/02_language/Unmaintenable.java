import java.util.*;

class Unmaintenable {
    public static void main(String[] argv) {
{
        int sum = 0, arr[] = {1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length; i += 7) {
            sum += arr[i+0]; 
            sum += arr[i+1]; /*
            sum += arr[i+2];  * 속도 향상을 위한
            sum += arr[i+3];  * 합계 계산 확장
            sum += arr[i+4];  */
            sum += arr[i+5];  
            sum += arr[i+6];
        }
        System.out.println(sum);
}
{
        int[] arr = {123, 824, 012, 457};
        System.out.println(Arrays.toString(arr));
}
        double __ = 0.0;
        Object ___ = Double.valueOf(__);
        while ( !(___.toString().equals("5.0")) )
            System.out.println(___= Double.valueOf(++__));
{      
        int a = 1, b = 2;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a+' '+b);
}
{      
        int a = 1, b = 2;

        // 메모리 절약을 위한 알고리즘 적용
        a = a + b;
        b = a - b;
        a = a - b;
}
        //
        // 회원 가입 처리 절차 변경으로 과거 코드 삭제
        // \u000a System.out.println("Hello, ");
        // 
        System.out.println("world.");

    }
    // 몬티 파이썬 주석
    /**
     * Enables this component.
     *
     * @see java.awt.Component#disable
     * @see java.awt.Component#isEnabled
     */
    public synchronized void enable() {
        //...
    }
}
