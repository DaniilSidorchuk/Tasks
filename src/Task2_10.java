/**
 - Вывести первые 5 минимальных элементов массива
 */
public class Task2_10 {
    public static void main(String[] args) {
        int[] x = {8, 7, 12, 15, 9, 2, 3, 69, 8, 12, 88, 1, 2000, 0};


        int b = 0;
        int i = 0;
        while (i < x.length && b < x.length) {
            if (x[b] <= x[i]) {
                if (i == x.length - 1) {
                    System.out.println("Minimum number is " + x[b]);
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

