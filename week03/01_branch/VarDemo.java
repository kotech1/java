class VarDemo {
    public static void main(String[] args) {
        // 자료형 추론(Type inference) JDK 10+ (2018~)
        var avg = 1.0; // avg는 double 이 됨. float일 경우 1.0f 사용
        System.out.println("Value of avg: " + avg);

        // 다음 var는 단순 변수이다.
        int var = 1;
        System.out.println("Value of var: " + var);

        var k = -var; // k는 int이다
        System.out.println("Value of k: " + k);
        //k = 23444.2334; // compile error
    }
}
