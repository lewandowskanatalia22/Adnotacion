import java.util.Scanner;

/**
 * Created by jan on 2017-08-06.
 */
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int number;

        System.out.println("podaj liczbę");
        number = myScanner.nextInt();
        int result =getAbsolute(number);


        System.out.println("wynik to: "+ result);
    }
    public  static int getAbsolute(int number){
        int result;

        if (number >0 ){
            result = number;
        }
        else{
            result = number * -1;
    }return result;
    }
}
