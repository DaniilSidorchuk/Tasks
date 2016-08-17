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
        int a1 = Math.abs(a);
        int b1 = Math.abs(b);
        if (a == b) {
            System.out.println("Number " + number1 + " is equally close to " + ten + " as number " + number2);
        }
        if (a1 < b1) {
            System.out.println("Number " + number1 + " is closer to " + ten + " than " + number2);
        }
        else System.out.println("Number " + number2 + " is closer to " + ten + " than " + number1);

        }
    }