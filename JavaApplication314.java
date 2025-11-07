/*
PROGRAMA QUE MUESTRA LA CANTIDAD DE NUMEROS PRIMOS DESDE 0 HASTA N
 */
package javaapplication3.pkg14;
//IMPORTANDO CLASES

import java.util.Scanner;

public class JavaApplication314 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //DECALARANDO VARIABLES
        int n, contador = 0;
        //SALIDA CONSOLA PIDE UN NUMERO
        System.out.print("Introduce un número: ");
        //LO GUARDA
        n = sc.nextInt();

        //PRIMER BUCLE: recorre todos los números desde 1 hasta n
        for (int i = 1; i <= n; i++) {
            //DECLARO UNA VARIABLE BOOLEANA PARA SABER SI ES PRIMO O NO
            boolean esPrimo = true;

            // SEGUNDO BUCLE: prueba divisores desde 2 hasta i - 1
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {      // Si el número tiene un divisor distinto de 1 y él mismo
                    esPrimo = false;   // entonces no es primo
                    break;             // salimos del bucle interno para no continuar probando con otros numeros
                }
            }

            if (esPrimo) {
                contador++;//Incrementamos en 1 la cantidad de numeros primos encontrados
            }
        }
        //SALIDA CONSOLA MUESTRA CANTIDAD DE NUMEROS PRIMOS
        System.out.println("Hay " + contador + " numeros primos entre 1 y " + n);
    }

}
