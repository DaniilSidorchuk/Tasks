/**
 - Найти сумму всех четных и сумму всех нечетных элементов массива
 */
public class Task2_7 {
    static int i = 0;
    static int[] x = {8, 7, 12, 15, 9, 2, 3, 69, 8, 12, 88, 1, 2000, 0};
    public static void main(String[] args) {
        int y = 0;
        boolean test1 = test1(x[i]);
        boolean test2 = test2(x[i]);

        while ( i < x.length){
            if (test1(x[i])){
                y = y + x[i];}
            i++;}
        System.out.println("Total amount of all even numbers is " + y);
        y=0;
        i=0;
        while ( i < x.length){
            if (test2(x[i])){
                y = y + x[i];}
            i++;}
                       
        System.out.println("Total amount of all odd numbers is " + y);
        }



    public static boolean test1 (int d ){
        int test = x[i]%2;
        boolean test2 = test ==0;
        return test2;
    }
    public static boolean test2 (int d ){
        int test = x[i]%2;
        boolean test2 = test != 0;
        return test2;
    }
    }

