/**
 * Created by Admin on 21.08.2016.
 */
public class Task1_3 {
    public static void main(String[] args) {


        int firstOperand = Integer.valueOf (args[0]);
        int secondOperand = Integer.valueOf (args[1]);
        String operation = "*";
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

