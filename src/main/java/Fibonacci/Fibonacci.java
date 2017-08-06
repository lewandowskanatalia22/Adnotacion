package Fibonacci;

import java.util.Scanner;

/**
 * Created by jan on 2017-08-06.
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("podaj x:");
        int x =scaner.nextInt();
        System.out.println(fibonacci(x));
    }
    public  static int fibonacci (int x){
        if (x<=2){
            return 1;
        }else {
            return x* fibonacci(x-2)+ fibonacci(x-1);

        }
    }

}
