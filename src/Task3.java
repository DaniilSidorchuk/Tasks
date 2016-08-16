/**
 3. Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа
 */
public class Task3 {

    static int number1 = 4;
    static int number2 = 4;
    static int number3 = 7;


    public static void main(String[] args) {


        if (compartion1(number1, number2) && compartion2(number1, number3)) {
            System.out.println("Minimun number is " + number1 + " from numbers: " + number1 + ", " + number2 + ", " + number3);
        }
        if (compartion3(number1, number2) && compartion2(number1, number3)) {
            System.out.print("Minimun numbers are " + number1 + ", " + number2 + " from numbers: " + number1 + ", " + number2 + ", " + number3);
        }
        if (compartion4(number1, number2) && compartion5(number2, number3)) {
            System.out.println("Minimun number is " + number2 + " from numbers: " + number1 + ", " + number2 + ", " + number3);
        }
        if (compartion6(number3, number1) && compartion8(number3, number2)) {
            System.out.println("Minimun number is " + number3 + " from numbers: " + number1 + ", " + number2 + ", " + number3);
        }
        if (compartion7(number3, number1) && compartion8(number3, number2)) {
            System.out.print("Minimun numbers are " + number3 + ", " + number1 + " from numbers: " + number1 + ", " + number2 + ", " + number3);
        }
        if (compartion6(number3, number1) && compartion9(number3, number2)) {
            System.out.print("Minimun numbers are " + number3 + ", " + number2 + " from numbers: " + number1 + ", " + number2 + ", " + number3);
        }
        if (compartion3(number1, number2) && compartion9(number3, number2) ){
            System.out.print("Minimun numbers are " + number3 + ", " + number2 + ", " + number3 + " from numbers: " + number1 + ", " + number2 + ", " + number3);
        }
    }

    public static boolean compartion1(int number1,int number2) {
        boolean compartion = number1 < number2;
        return compartion;
    }
    public static boolean compartion2 (int number1, int number3 ){
        boolean compartion = number1 < number3;
        return compartion;
    }
    public static boolean compartion3 (int number1, int number2 ){
        boolean compartion = number1 == number2;
        return compartion;
    }
    public static boolean compartion4 (int number1, int number2 ){
        boolean compartion = number1 > number2;
        return compartion;}
    public static boolean compartion5 (int number2, int number3 ){
        boolean compartion = number2 < number3;
        return compartion;}

    public static boolean compartion6 (int number3, int number1 ){
        boolean compartion = number3 < number1;
        return compartion;}
    public static boolean compartion7 (int number3, int number1 ){
        boolean compartion = number3 == number1;
        return compartion;}
    public static boolean compartion8 (int number3, int number2 ) {
        boolean compartion = number3 < number2;
        return compartion;}

    public static boolean compartion9(int number3, int number2) {
        boolean compartion = number3 == number2;
        return compartion;
    }

}
