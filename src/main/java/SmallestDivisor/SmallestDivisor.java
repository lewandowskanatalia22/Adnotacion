package SmallestDivisor;

import java.util.Scanner;

/**
 * Created by jan on 2017-08-06.
 */
public class SmallestDivisor {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int result;
        System.out.println("enter two  intiger values: ");
        int userInputA = scanner.nextInt() ;
        int userInputB = scanner.nextInt();
        System.out.println(getSmallesDivisor(userInputA,userInputB));

    }
    public static int getSmallesDivisor (int a , int b) {

        while (a != b) {

                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;

                }
            }
            return a;
        }
    }

