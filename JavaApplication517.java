/*
 Programa que crea una tabla con las sumas de elementos consecutivos.
 Implementa la función suma(int t[], int numElementos).
*/
package javaapplication5.pkg17;
//importando clases
import java.util.Arrays;
import java.util.Scanner;


public class JavaApplication517 {
    
    /*
     Crea una tabla con las sumas de numElementos elementos consecutivos
     t tabla original
     numElementos cantidad de elementos a sumar
     devuelve tabla con las sumas
    */
    static int[] suma(int t[], int numElements) {
        // Calculo tamaño del resultado
        int tamañoResultado = t.length - numElements + 1;
        int[] resultado = new int[tamañoResultado];
        // Para cada posición inicial
        for (int i = 0; i < tamañoResultado; i++) {
            int suma = 0;
            // Sumo los numElements elementos consecutivos
            for (int j = i; j < i + numElements; j++) {
                suma += t[j];
            }
            resultado[i] = suma;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numElementos;
        // Pedir tamaño y crear tabla
        System.out.println("Introduzca el tamano de la tabla: ");
        int tamano = sc.nextInt();

        int[] t = new int[tamano];
        
        // Rellenar tabla
        System.out.println("Rellene la tabla");
        for (int i = 0; i < t.length; i++) {
            System.out.println("Numero " + (i + 1) + " : ");
            t[i] = sc.nextInt();
        }
        // Pedir cantidad de elementos consecutivos
        System.out.println("Introduce la cantidad de elementos consecutivos a sumar: ");
        numElementos = sc.nextInt();
        
        // Valido que numElements esté (entre 1 y t.length)
        while(numElementos > t.length || numElementos <= 0){
            System.out.println("El numero debe estar entre 1 y " + t.length);
            System.out.print("Introduce la cantidad de elementos: ");
            numElementos = sc.nextInt();
        }
        // Llamar a la función
        int[] resultado = suma(t, numElementos);
        
        // Muestro el resultado
        System.out.println("Resultado de las sumas:");
        System.out.println("Resultado: " + Arrays.toString(resultado));
    }
}
