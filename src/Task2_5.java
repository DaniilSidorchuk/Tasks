/**
 - Найти сумму первых n элементов массива
 */
public class Task2_5 {
   static int n = 5;
    public static void main(String[] args) {
        int [] x = new int [100];
        x[0]=8;
        x[1]=7;
        x[2]=12;
        x[3]=15;
        x[4]=9;
        x[5]=2;
        x[6]=3;
        x[7]=69;
        x[8]=8;
        x[9]=12;
        x[10]=88;
        int y = 0;
        int sum = 0;
        int i = 0;

        while (i <= n){
        y = y + x[i];
            i++;
            if (i == n) {
               sum = y ;
                break;
            }
            }
        System.out.println(sum);
        }


    }


