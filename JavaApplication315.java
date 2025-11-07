/*
 PROGRAMA QUE CREA EL TRIANGULO DE PASCAL A TRAVES DE UNA ENTRADA
 */
package javaapplication3.pkg15;
//IMPORTANDO CLASES

import java.util.Scanner;

public class JavaApplication315 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //SALIDA CONSOLA QUE SOLICITA EL NUMERO DE FILAS PARA CREAR EL TRIANGULO
        System.out.print("Ingrese el numero de filas: ");
        //LO GUARDA
        int n = scanner.nextInt();
        //CREANDO EL TRIANGULO DE PASCAL
        System.out.println("\nTriangulo de Pascal:");
        //Recorre cada fila del triángulo
        for (int fila = 0; fila < n; fila++) {
            // Espacios para centrar
            for (int espacio = 0; espacio < n - fila - 1; espacio++) {
                System.out.print("  ");
            }

            // Calcular e imprimir los números de la fila
            int numero = 1;
            for (int elemento = 0; elemento <= fila; elemento++) {
                 // Imprime el número con ancho fijo (4 espacios) para alinear las columnas
                System.out.printf("%4d", numero);
                // Calcular el siguiente número usando: C(n,k+1) = C(n,k) * (n-k)/(k+1)
                numero = numero * (fila - elemento) / (elemento + 1);
            }
            //SALTO DE LINEA PARA MANTENER LA PIRAMIDE
            System.out.println();
        }
    }

}
