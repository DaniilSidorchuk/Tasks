/**
 6. Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11
 */
public class Task6 {
    public static void main(String[] args) {
        int number1 = 8;
        int number2 = 11;
        int ten = 10;
        int a = ten - number1;
        int b = ten - number2;
        if (a ==b ){
            System.out.println("Number " + number1 + " is equally close to " + ten + " as number " + number2);
        }
        if (a >= 0 && b >= 0) {
            if (a < b) {
                System.out.println("Number " + number1 + " is closer to " + ten + " than " + number2);
            } if (a>b) { System.out.println("Number " + number2 + " is closer to " + ten + " than " + number1);
        }}
        if (a < 0 && b < 0) {
            if (a > b) {
                System.out.println("Number " + number1 + " is closer to " + ten + " than " + number2);
            } if (a<b) { System.out.println("Number " + number2 + " is closer to " + ten + " than " + number1);
        }}
        if (a < 0 && b > 0) {
            a = a * -1;
            if (a < b) {
                System.out.println("Number " + number1 + " is closer to " + ten + " than " + number2);
            } if (a>b) { System.out.println("Number " + number2 + " is closer to " + ten + " than " + number1);
        }}
        if (a > 0 && b < 0) {
            b = b * -1;
            if (a < b) {
                System.out.println("Number " + number1 + " is closer to " + ten + " than " + number2);
            } if (a>b) { System.out.println("Number " + number2 + " is closer to " + ten + " than " + number1);
        }}

    }
}
