package ArraySum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jan on 2017-08-06.
 */
public class ArraySum {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("podaj liczbę elementów tablicy :");
        int size =scanner.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i < size; i++){
            System.out.println("podaj element nr : "+ i);
            array.add(scanner.nextInt());

        }
        System.out.println("wynik: " +getArraySum(array));

    }


    public  static int getArraySum (ArrayList<Integer> array){
        int result =0;
        for (int i = 0; i <array.size();i ++){
            result += array.get (i);

        }return result;
    }

}
