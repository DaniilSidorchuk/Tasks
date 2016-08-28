/**
 - Перевести число в двоичную систему счисления
 */
public class Task2_9 {
    public static void main(String[] args) {
        int number = 99;
        int [] x = new int [100];
        int i = 0;


        while (number >0 ){

            if (number == 0){
                x[i] = 1;
                break;
            }
            if (test(number) ){
                x[i] = 0;
            }
            else x[i] = 1;
            number = number/2;
            i++;


        }
while (i>0){
    i--;
    System.out.print(x[i]);

}

    }

public static boolean test (int number){
    boolean test = number%2 == 0;
    return test;
}

}
