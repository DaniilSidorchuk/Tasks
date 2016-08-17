/**
 1. Создайте калькулятор, который выполняет, базовые арифметические операции:
 - умножение;
 - деление;
 - сложение;
 - вычитание;
 - остаток от деления (%);
 - нахождение модуля числа (можно использовать Math.abs)
 входные данные здесь можно представить как:
 String operation = "addition";
 int firstOperand = 15;
 int secondOperand = 12;
 */
public class Task1_1 {
    public static void main(String[] args) {
        int firstOperand = 15;
        int secondOperand = 12;
        String operation = "rest of dividing";

        int resultOperation1 = operation1(firstOperand, secondOperand);
        double resultOperation2 = operation2(firstOperand, secondOperand);
        int resultOperation3 = operation3(firstOperand, secondOperand);
        int resultOperation4 = operation4(firstOperand, secondOperand);
        int resultOperation5 = operation5(firstOperand, secondOperand);

        if (operation == "multiplication") {
            System.out.println("Result of " + operation + " is " + resultOperation1);}
        if (operation == "dividing") {
                System.out.println("Result of " + operation + " is " + resultOperation2);
            }
        if (operation == "addition") {
                System.out.println("Result of " + operation + " is " + resultOperation3);
            }
        if (operation == "subtraction") {
                System.out.println("Result of " + operation + " is " + resultOperation4);
            }
        if (operation == "rest of dividing") {
                System.out.println(operation + " is " + resultOperation5);
            }
        if (operation == "module") {
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

