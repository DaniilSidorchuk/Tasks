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
        String operation1 = "multiplication";
        String operation2 = "dividing";
        String operation3 = "addition";
        String operation4 = "subtraction";
        String operation5 = "remainder of the dividing";
        String operation6 = "determination of the module";
        int resultOperation1 = operation1(firstOperand, secondOperand);
        double resultOperation2 = operation2(firstOperand, secondOperand);
        int resultOperation3 = operation3(firstOperand, secondOperand);
        int resultOperation4 = operation4(firstOperand, secondOperand);
        int resultOperation5 = operation5(firstOperand, secondOperand);
        int module1 = Math.abs(firstOperand);
        int module2 = Math.abs(secondOperand);
        System.out.println("Result of " + operation1 + " is " + resultOperation1);
        System.out.println("Result of " + operation2 + " is " + resultOperation2);
        System.out.println("Result of " + operation3 + " is " + resultOperation3);
        System.out.println("Result of " + operation4 + " is " + resultOperation4);
        System.out.println("Result of " + operation5 + " is " + resultOperation5);
        System.out.println("Modul of firstOperand is " + module1);
        System.out.println("Modul of secondOperand is " + module2);
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

