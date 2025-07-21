// CallByRef.java

class CallByRef {
    static void setInt(int a, int b) {
        a = b;
    }
    static void setId(Club a, int b) {
        a.id = b;
    }
    static void setArray0(int[] a, int b) {
        a[0] = b;
    }
    public static void main(String[] args) {
        int c = 0;
        setInt(c, 3);
        System.out.println(c); // 0

        Club a = new Club();
        setId(a, 3);
        System.out.println(a.id); // 3

        int[] d = new int[10];
        setArray0(d, 3);
        System.out.println(d[0]); // 3
    }
}

