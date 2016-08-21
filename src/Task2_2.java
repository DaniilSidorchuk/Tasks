/**
 Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
 */
public class Task2_2 {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 55){
            System.out.println(number);
            number=number+2;
        }
    }
}
