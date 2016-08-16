/**
 5. Даны 2 числа, определить делится ли первое число на второе без остатка
 */
public class Task5 {
    public static void main(String[] args) {
        int number1 = 9;
        int number2 = 2;

        if (test(number1, number2)) {
            System.out.println("The fission process has been carried out without the rest.");
                }
        if (test1(number1, number2)) {
            System.out.println("The fission process has been carried out with the rest.");
                    }
    }
    public static boolean test (int number1, int number2){
        boolean test = number1 % number2 == 0;
        return test;
    }
    public static boolean test1 (int number1, int number2){
        boolean test = number1 % number2 != 0;
        return test;}
}
