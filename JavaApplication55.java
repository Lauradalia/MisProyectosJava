/*
 Programa que permite insertar un número en una tabla ordenada de enteros,
 manteniendo el orden ascendente. El usuario introduce los elementos iniciales
 (ya ordenados o no) y luego el número que desea agregar. El programa muestra la
 tabla antes y después de la inserción.
 */

package javaapplication5.pkg5;
//importando clases
import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication55 {
    
    /*
      Inserta un elemento en una tabla ordenada manteniendo el orden
      t tabla ordenada
      nuevo elemento a insertar
      devuelve nueva tabla con el elemento insertado
     */
    static int[] insertar(int[] t, int nuevo){

        int indiceInsercion = Arrays.binarySearch(t, nuevo);

        //Si no lo encuentra, calcular posición correcta
        if(indiceInsercion < 0){
            indiceInsercion = -indiceInsercion - 1;
        }

        //Crear nueva tabla con espacio extra
        int[] copia = new int[t.length + 1];

        //Copiar elementos antes del hueco
        System.arraycopy(t, 0, copia, 0, indiceInsercion);

        //Copiar elementos después del hueco (desplazados)
        System.arraycopy(t, indiceInsercion, copia, indiceInsercion +1, t.length - indiceInsercion);

        //Insertar el nuevo elemento
        copia[indiceInsercion] = nuevo;

        //Devolver la nueva tabla
        return copia;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Crear tabla ordenada inicial
        System.out.print("Cuantos elementos iniciales?: ");
        int tamano = sc.nextInt();
        
        int[] tabla = new int[tamano];
        
        System.out.println("\nIngrese " + tamano + " numeros ordenados:");
        for(int i = 0; i < tamano; i++){
            System.out.print("Numero " + (i+1) + ": ");
            tabla[i] = sc.nextInt();
        }
        
        //Ordenar por si acaso (aunque deberían estar ordenados)
        Arrays.sort(tabla);
        
        System.out.println("\nTabla inicial: " + Arrays.toString(tabla));
        
        //Pedir elemento a insertar
        System.out.print("\nQue numero desea insertar?: ");
        int nuevo = sc.nextInt();
        
        //Insertar (IMPORTANTE: guardar el resultado)
        tabla = insertar(tabla, nuevo);
        
        //Muestro resultado
        System.out.println("\nTabla despues de insertar: " + Arrays.toString(tabla));

        
    }
}
