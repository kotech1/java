// Scope.java
public class Scope {
    public static void main(String[] args) {
        int a;
        a = 1;
        {
            //int a = 3; //error
            int b;
        }
        //System.out.println(b); //error
    }
}


