public class BoxExample2 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        // Boxing
        Integer a;
        //a = new Integer(100);     // JDK9+ deprecated
        a = Integer.valueOf(100); // caching: -128~127

        // Unboxing
        int b;
        b = a.intValue();

        // Autobox
        Double c = 3.14;

        // Auto-unbox
        double d = c;
    }
}
