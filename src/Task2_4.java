import java.util.Arrays;

/**
 Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
 */
public class Task2_4 {

    public static void main(String[] args) {


        int a = 2;
        int b = 1;
        int c = 0;
        while (b<= 524288) {
            c = a * b;
            System.out.println(c);
            b = b * 2;
        }
    }
}
