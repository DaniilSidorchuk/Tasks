import java.util.Arrays;

/**
 Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
 */
public class Task2_4 {

    public static void main(String[] args) {

        double []a = new double[20];
        a[0]=2;
        int i = 0;
        int b = 2;
        while (i <= a.length) {
            System.out.println(a[i]);
            i++;
            a[i] = Math.pow(2, b);
            b++;
        }
    }
}
