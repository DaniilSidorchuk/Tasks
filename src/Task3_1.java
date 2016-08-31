public class Task3_1 {
    public static void main(String[] args) {
int size = 5;
        int[][] x = new int[size][size];
        int n = 0;
        int m = 0;
        int n1 = 0;
        int m1 = 0;


        while (n <= x.length && m <= x.length) {
            if (n == m ) {
                x[n][m] = 1;
                m=0;
                if (n<=x.length-1) {
                    n++;
                }
            }
            if (m == 0) {
                x[n][m] = 1;
                if (m<=x.length-1){
                m++;}

            }
            if (n > m && m != 0) {
                n1 = n - 1;
                m1 = m - 1;
                x[n][m] = x[n1][m1] + x[n1][m];
                if (m<=x.length-1){
                    m++;}
            }
            if (n == x.length-1 && m == x.length-1){
                x[n][m] = 1;
                break;
            }

        }


        System.out.println(x[0][0]);
        System.out.println(x[1][0] + " " + x[1][1]);
        System.out.println(x[2][0] + " " + x[2][1] + " " + x[2][2]);
        System.out.println(x[3][0] + " " + x[3][1] + " " + x[3][2] + " " + x[3][3]);
        System.out.println(x[4][0] + " " + x[4][1] + " " + x[4][2] + " " + x[4][3] + " " + x[4][4]);

    }
    }

