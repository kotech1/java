// Break.java
class Break {
    public static void main(String[] args) {
        int i, j;

        all:
        for (i=1; i<5; i++)
        {
        one:
            {
        two:    {
        three:      {
                        System.out.println("\ni is " + i);
                        if (i==1) break one;
                        if (i==2) break two;
                        if (i==3) break three;
                        if (i==4) break all; // same as break;
                        // this is never reached
                        System.out.println("After inner loop.");
                    }
                    System.out.println("After block three.");
                }
                System.out.println("After block two.");
            }
            System.out.println("After block one.");
        }
        System.out.println("After for.");

        j_loop: 
        for (j=0; j<10; j++)
        {
            i_loop:
            for (i=0; i<10; i++) {
                if (j == 1 && i == 2) continue i_loop; // what if j==3 && i==8
                if (j == 3 && i == 8) break j_loop;
            }
        }
        System.out.println("i = " + i + ", j = " + j);
    }
}
