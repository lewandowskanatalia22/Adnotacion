package factorial;

import java.util.Scanner;

/**
 * Created by jan on 2017-08-06.
 */
public class CalculateFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("podaj liczbę: ");
        n = scanner.nextInt();

        System.out.println("Wartość silni: " + calculateFactorial(n));
    }
        public static int calculateFactorial ( int n){
            if (n <= 1) {
                return 1;
            }else {
                return n*calculateFactorial(n-1);

            }
        }
    }
