/**
 4. Написать программу, которая проверит, является ли число четным или нечетным
 */
public class Task4 {
    public static void main(String[] args) {
        int number = 8;
        if (test(number)) {
            System.out.println("Number - " + number + " is even");
        }
        if (test2(number)) {
            System.out.println("Number - " + number + " is uneven");
        }
    }


    public static boolean test(int number) {
        boolean test = number % 2 == 0;
        return test;
    }

    public static boolean test2(int number) {
        boolean test = number % 2 != 0;
        return test;
    }
}