/**
 - Перевести число в двоичную систему счисления
 */
public class Task2_9 {
    public static void main(String[] args) {
        int number = 100;
        int [] x = new int [100];
        int i = 0;


        while (number >0 ){

            if (number == 0){
                x[i] = 1;
                System.out.println(x[i]);
                break;
            }
            if (test(number) ){
                x[i] = 0;
            }
            else x[i] = 1;
            System.out.println(x[i]);
            number = number/2;
            i++;


        }


    }

public static boolean test (int number){
    boolean test = number%2 == 0;
    return test;
}

}
