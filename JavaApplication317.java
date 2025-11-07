/*
 PROGRAMA QUE ENCUENTRA EL MAXIMO COMUN DIVISOR ENTRE 2 NUMEROS
 */
package javaapplication3.pkg17;
//IMPORTANDO CLASES

import java.util.Scanner;

public class JavaApplication317 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //DECLARANDO LAS VARIABLES
        int a, b, menor, mcd;
        //SALIDA CONSOLA PIDE EL PRIMER NUMERO
        System.out.print("Ingrese el primer numero (a): ");
        //LO GUARDA
        a = scanner.nextInt();
        //SALIDA CONSOLA PIDE EL SEGUNDO NUMERO
        System.out.print("Ingrese el segundo numero (b): ");
        //LO GUARDA
        b = scanner.nextInt();

        // Encontrar el menor de los dos números
        menor = (a < b) ? a : b;

        // Buscar el MCD de forma decreciente
        mcd = 1; // Por defecto, el MCD mínimo es 1

        for (int i = 1; i <= menor; i++) {
            if (a % i == 0 && b % i == 0) {
                mcd = i; // el último valor guardado será el MCD
            }
        }
        //SALIDA CONSOLA MUESTRA EL MAXIMO COMUN DIVISOR ENTRE LOS 2 NUMEROS
        System.out.println("El maximo comun divisor de " + a + " y " + b + " es: " + mcd);
    }

}
