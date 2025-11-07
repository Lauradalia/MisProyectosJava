/*
PROGRAMA QUE DE UN NUMERO ENTERO TE DICE EL NUMERAL(EL NOMBRE DEL NUMERO EN LETRAS)
*/
package javaapplication2.pkg14;

import java.util.Scanner;

public class JavaApplication214 {

    public static void main(String[] args) {
        //DECLARANDO VARIABLES
        int n;
        int decenas;
        int unidades;

        //SALIDA CONSOLA PIDE NUMERO DEL 1 AL 99
        System.out.print("Ingrese un número entre 1 y 99: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        //SEPARANDO DECENAS Y UNIDADES
        decenas = n / 10;
        unidades = n % 10;

        //VALORANDO SI N ESTA EN EL RANGO
        if (n < 1 || n > 99) {
            System.out.println("Número fuera de rango.");
        }

        // NUMEROS DEL 1 AL 9
        else if (n < 10) {
            switch (n) {
                case 1 -> System.out.println("Uno");
                case 2 -> System.out.println("Dos");
                case 3 -> System.out.println("Tres");
                case 4 -> System.out.println("Cuatro");
                case 5 -> System.out.println("Cinco");
                case 6 -> System.out.println("Seis");
                case 7 -> System.out.println("Siete");
                case 8 -> System.out.println("Ocho");
                case 9 -> System.out.println("Nueve");
                default -> System.out.println("");
            }
        }

        //NUMEROS DEL 10 AL 15 (formas únicas)
        else if (n >= 10 && n <= 15) {
            switch (n) {
                case 10 -> System.out.println("Diez");
                case 11 -> System.out.println("Once");
                case 12 -> System.out.println("Doce");
                case 13 -> System.out.println("Trece");
                case 14 -> System.out.println("Catorce");
                case 15 -> System.out.println("Quince");
                default -> System.out.println("");
            }
        }

        // NUMEROS DEL 16 AL 19 (Dieci...)
        else if (n >= 16 && n <= 19) {
            System.out.print("Dieci");
            switch (unidades) {
                case 6 -> System.out.println("seis");
                case 7 -> System.out.println("siete");
                case 8 -> System.out.println("ocho");
                case 9 -> System.out.println("nueve");
                default -> System.out.println("");
            }
        }

        // NUMEROS DEL 20 AL 29 (Veinti...)
        else if (n >= 20 && n <= 29) {
            if (n == 20) {
                System.out.println("Veinte");
            } else {
                System.out.print("Veinti");
                switch (unidades) {
                    case 1 -> System.out.println("uno");
                    case 2 -> System.out.println("dos");
                    case 3 -> System.out.println("tres");
                    case 4 -> System.out.println("cuatro");
                    case 5 -> System.out.println("cinco");
                    case 6 -> System.out.println("seis");
                    case 7 -> System.out.println("siete");
                    case 8 -> System.out.println("ocho");
                    case 9 -> System.out.println("nueve");
                    default -> System.out.println("");
                }
            }
        }

        // NUMEROS DEL 30 AL 99 (Decena y unidad)
        else {
            switch (decenas) {
                case 3 -> System.out.print("Treinta");
                case 4 -> System.out.print("Cuarenta");
                case 5 -> System.out.print("Cincuenta");
                case 6 -> System.out.print("Sesenta");
                case 7 -> System.out.print("Setenta");
                case 8 -> System.out.print("Ochenta");
                case 9 -> System.out.print("Noventa");
                default -> System.out.println("");
            }

            if (unidades != 0) {
                System.out.print(" y ");
                switch (unidades) {
                    case 1 -> System.out.println("uno");
                    case 2 -> System.out.println("dos");
                    case 3 -> System.out.println("tres");
                    case 4 -> System.out.println("cuatro");
                    case 5 -> System.out.println("cinco");
                    case 6 -> System.out.println("seis");
                    case 7 -> System.out.println("siete");
                    case 8 -> System.out.println("ocho");
                    case 9 -> System.out.println("nueve");
                    default -> System.out.println("");
                }
            }
        }
    }
    
}
