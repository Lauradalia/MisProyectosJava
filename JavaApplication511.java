/*
 Programa que pide al usuario una tabla de números enteros y una clave a buscar.
 Luego, mediante la función buscarTodos(), obtiene todas las posiciones (índices)
 donde aparece la clave dentro de la tabla. 
 Si la clave no se encuentra, se devuelve una tabla vacía.
 Finalmente, el programa muestra las posiciones encontradas por pantalla.
 */
package javaapplication5.pkg11;

import java.util.Scanner;

public class JavaApplication511 {
    
    /*
     Función que busca todas las posiciones donde aparece una clave
     en un arreglo dado.
     t arreglo donde buscar
     clave valor que se desea encontrar
     devuelve arreglo con los índices donde se encuentra la clave
     o un arreglo vacío si no se encuentra.
     */
static int[] buscarTodos(int t[], int clave) {
        // Contador de apariciones de la clave
        int contador = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                contador++;// cuenta cuántas veces aparece la clave
            }
        }
        
        // Crear array del tamaño exacto
        int[] posiciones = new int[contador];
        int index = 0;
        
        // Llenar el array con las posiciones
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                posiciones[index] = i;// guardamos el índice
                index++;    // avanzamos en el arreglo de posiciones
            }
        }
        // Devuelve el arreglo con las posiciones encontradas
        return posiciones;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int clave;
        // Pedimos el tamaño de la tabla
        System.out.println("Introduzca el tamano de la tabla: ");
        int tamano = sc.nextInt();
        
        // Creamos y llenamos el arreglo
        int[] t = new int[tamano];
        System.out.println("Rellene la tabla");
        for (int i = 0; i < t.length; i++) {
            System.out.print("Numero " + (i + 1) + " : ");
            t[i] = sc.nextInt();
        }
        
        // Pedimos la clave a buscar
        System.out.println("Introduce la clave a buscar: ");
        clave = sc.nextInt();
        
        // Llamamos a la función de búsqueda
        int[] resultado = buscarTodos(t, clave);
        
        // Muestro resultados
        if (resultado.length == 0) {
            System.out.println("La clave " + clave + " no se encontro en la tabla.");
        } else {
            System.out.println("La clave " + clave + " se encontro " + " en las posiciones: ");
            for (int posicion : resultado) {
                System.out.println(posicion + " ");
            }
        }
    }
}