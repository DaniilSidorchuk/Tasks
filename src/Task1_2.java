import java.util.Scanner;

/**
 2. Добавить к калькулятору возможность ввода операции и чисел из консоли.
 В начале выводите сообщение "Введите операцию:",
 дальше пользователь вводит операцию,
 далее "Введите первое число:" - вводит,
 "Введите второе число: " - пользователь вводит.
 */
public class Task1_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Type name of the operation");
        String operation = scanner.nextLine();
        System.out.println("Type first number");
        int firstOperand = scanner.nextInt();
        System.out.println("Type second nuber");
        int secondOperand = scanner.nextInt();

        int resultOperation1 = operation1(firstOperand, secondOperand);
        double resultOperation2 = operation2(firstOperand, secondOperand);
        int resultOperation3 = operation3(firstOperand, secondOperand);
        int resultOperation4 = operation4(firstOperand, secondOperand);
        int resultOperation5 = operation5(firstOperand, secondOperand);

        if (operation.equals ("*")) {
            System.out.println("Result of multiplication is " + resultOperation1);}
        if (operation.equals ("/")) {
            System.out.println("Result of dividing is  " + resultOperation2);
        }
        if (operation.equals ("+")) {
            System.out.println("Result of addition is " + resultOperation3);
        }
        if (operation.equals ("-")) {
            System.out.println("Result of subtraction is " + resultOperation4);
        }
        if (operation.equals  ("rest of dividing")) {
            System.out.println(operation + " is " + resultOperation5);
        }
        if (operation.equals ("module")) {
            System.out.println("Modules are " + Math.abs(firstOperand) + " " + Math.abs(secondOperand));
        }

    }

    public static int operation1(int firstOperand, int secondOperand) {
        int resultOperation1 = firstOperand * secondOperand;
        return resultOperation1;
    }

    public static double operation2(int firstOperand, int secondOperand) {
        double resultOperation2 = firstOperand / secondOperand;
        return resultOperation2;
    }

    public static int operation3(int firstOperand, int secondOperand) {
        int resultOperation3 = firstOperand + secondOperand;
        return resultOperation3;
    }

    public static int operation4(int firstOperand, int secondOperand) {
        int resultOperation4 = firstOperand - secondOperand;
        return resultOperation4;
    }

    public static int operation5(int firstOperand, int secondOperand) {
        int resultOperation5 = firstOperand % secondOperand;
        return resultOperation5;
    }

}
