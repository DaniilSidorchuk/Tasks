/**
 - Найти все счастливые билеты от 100000 до 999999 :
 билет счастливый если сумма первых трех цифр равна сумме трех последних
 например,  123312: 1+2+3==3+1+2

 */
public class Task2_8 {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int number5 = 0;
        int number6 = 0;
        int ticket = 100000;
        int lucky = 0;
        int tickets = 0;

        while (ticket <= 999999) {
        number1 = (ticket % 1000000) / 100000;
        number2 = (ticket%100000) / 10000;
        number3 = (ticket%10000) / 1000;
        number4 = (ticket%1000) / 100;
        number5 = (ticket%100) / 10;
        number6 = ticket%10;
        if (lucky(number1, number2, number3, number4, number5, number6)){
            lucky = ticket;
            System.out.println(lucky);
            tickets++;
        }
        ticket++;
        }
        System.out.println("Quantity of lucky tickets is " + tickets);
    }

    public static boolean lucky (int number1, int number2, int number3, int number4, int number5, int number6){
        int lucky1 = number1 + number2 + number3;
        int lucky2 = number4 + number5 + number6;
        boolean luckyTicket = lucky1 == lucky2;
        return luckyTicket;
    }
}