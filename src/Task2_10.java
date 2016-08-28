/**
 - Вывести первые 5 минимальных элементов массива
 */
public class Task2_10 {
    public static void main(String[] args) {
        int[] x = {8, 7, 12, 15, 9, 2, 3, 69, 8, 12, 88, 1, 2000, 0};
        int n = 5;
        int[] y = new int[n];
        int i = 0;
        int b = 0;
        while (i < x.length && b < x.length) {
            if (x[b] >= x[i]) {
                if (i == x.length - 1) {
                    break;
                }
                if (i < x.length) {
                    i++;
                }

            } else if (b < x.length) {
                b++;
            }

        }
        int max = x[b];
        b = 0;
        i = 0;
        int j = 0;
        int number = 1;
        while (i < x.length && b < x.length) {
            if (x[b] <= x[i]) {
                    if (i < x.length) {
                        i++;
                    }
                if (i == x.length) {
                    System.out.println("Minimum number " + number + " from array x is " + x[b]);
                    y[j] = x[b];
                    x[b] = max;
                    i = 0;
                    b = 0;
                    j++;
                    number++;
                    if (j == n) {
                        break;
                    }
                }

                } else if (b < x.length) {
                    b++;
                }
            }

        }
    }
