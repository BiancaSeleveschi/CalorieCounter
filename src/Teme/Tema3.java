package Teme;
//1.Scrie un program care sa afiseze media numerelor consecutive de la x la y, unde x si y sunt introduse de la tastatura.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Tema3 {
    public static void main(String[] args) {
        Exercise();
    }

    static void Exercise() {
        Scanner console = new Scanner(System.in);

        float average = 0;
        System.out.println("Please enter the first number");
        int x = console.nextInt();
        System.out.println("Please enter the second number");

        int y = console.nextInt();
        int[] numbers = new int[]{x, y};
        int sum = 0;

        Arrays.sort(numbers);
        System.out.println("Media numerelor consecutive este");
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        average =(float)(sum)/ numbers.length;

        System.out.println(average);


//    //    Scrie un program care afiseaza toate numerele de la x la y care sunt divizibile si cu 3 si cu 7 in acelasi timp, unde x si y sunt introduse de la tastatura.
//        Scanner console = new Scanner(System.in);
//        int x = console.nextInt();
//        int y = console.nextInt();
//        int[] numbers = {x, y};
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 3 == 0) {
//                System.out.println(numbers[i]);
//            }if (numbers[i]%7==0) {
//                System.out.println(numbers[i]);
//            }
//        }
//        System.out.println("Numerele divizibile sunt");
//        System.out.println();

    }

    static void Exercise2() {
//        Scrie un program care verifica daca un numar introdus de la tastatura este numar prim
        Scanner console = new Scanner(System.in);
        int a;
        System.out.println("Urmeaza sa se afiseze daca numarul e prim");
        System.out.println("Introdu numarul a");
        a = console.nextInt();
        boolean prim = true;
        for (int i = 2; i < a; i++) {
            System.out.println(a + "nu este numar prim");
            prim = false;
            break;
        }
    }
    //   if (prim == true) {

}



