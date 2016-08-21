/**
 4. Задача "Чаевые".
 входные данные: сумма, которую вы должны заплатить и уровень сервиса
 в зависимости от уровня сервиса посчитайте количество денег, которое вы должны оставить:
 - terrible (0%)
 - poor (5%)
 - good (10%)
 - great (15%)
 - excellent (20%)
 */
public class Task1_4 {
    public static void main(String[] args) {
double amount = 300;
        String service = "terrible";
        switch (service){
            case "terrible":
                System.out.println("Tips are " + amount*0 + " due to terrible service." );
                break;
            case "poor":
                System.out.println("Tips are " + amount*0.05 + " due to poor service." );
                break;
            case "good":
                System.out.println("Tips are " + amount*0.10 + " due to good service." );
                break;
            case "great":
                System.out.println("Tips are " + amount*0.15 + " due to great service." );
                break;
            case "excellent":
                System.out.println("Tips are " + amount*0.2 + " due to excellent service." );
                break;
        }
    }
}
