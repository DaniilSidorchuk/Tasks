/**
 - Найти сумму всех четных и сумму всех нечетных элементов массива
 */
public class Task2_7 {
    static int i = 0;
    static int[] x = {8, 7, 12, 15, 9, 2, 3, 69, 8, 12, 88, 1, 2000, 0};
    public static void main(String[] args) {
                int y = 0;
        boolean test = test(x[i]);

        while ( i < x.length){
            if (test(x[i]) == true){
                y = y + x[i];
                if (i == x.length - 1){
                    System.out.println(y);
                    break;
                }
            }
            else i++;
        }
    }

    public static boolean test (int d ){
        int test = x[i]%2;
        boolean test2 = test ==0;
        return test2;
    }

    }
}
