import java.lang.ArrayIndexOutOfBoundsException;
/**
 - Найти минимальный и максимальный элемент массива
 */
public class Task2_6 {
    public static void main(String[] args) {
        int[] x = new int[12];
        x[0] = 8;
        x[1] = 7;
        x[2] = 12;
        x[3] = 15;
        x[4] = 9;
        x[5] = 2;
        x[6] = 3;
        x[7] = 69;
        x[8] = 8;
        x[9] = 12;
        x[10] = 88;
        x[11] = 1;

        int b = 0;
        int i = 0;
        while (i < x.length && b < x.length) {
            if (x[b] <= x[i]) {
                if (i == 11) {
                    System.out.println(x[b]);
                    break;
                }
                if (i < x.length) {
                    i++;
                }


            } else if (b < x.length) {
                b++;
            }
        }
i = 0;
b = 0;
        while (i < x.length && b < x.length) {
            if (x[b] >= x[i]) {
                if (i == 11) {
                    System.out.println(x[b]);
                    break;
                }
                if (i < x.length) {
                    i++;
                }

            } else if (b < x.length) {
                b++;
            }

        }

    }
}