// MethodOverloading.java
class MethodOverloading {
/*
    static int min(int a, int b) {
        return (a <= b) ? a : b;
    }
*/

    /*
    // compile error
    static float min(int a, int b) {
        return (a <= b) ? (float)a : (float)b;
    }
    */

/*
    static double min(double a, double b) {
        return (a <= b) ? a : b;
    }
*/

    static double min(int a, double b) {
        return (a <= b) ? (double)a : b;
    }

    static double min(double a, int b) {
        return (a <= b) ? a : (double)b;
    }

    static float abs(float a) {
        return a >= 0 ? a : -a;
    }


    public static void main(String[] args) 
    {
        float b = (float)Math.abs(-3.0);
        System.out.println(b);
        //double c = min(1, 3); // 1
        //System.out.println(c);
        //double d = min(1.0, 3.0); // 1.0

        //double d = min(1, 3);
        //System.out.println(d);
    }
}

