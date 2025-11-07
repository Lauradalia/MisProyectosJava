/*
 Programa que elimina un elemento de una tabla ordenada.
 Implementa eliminación ordenada.
 */
package javaapplication5.pkg6;

import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication56 {
    
    /*
     * Elimina un elemento de una tabla ordenada
     t tabla ordenada
     aBorrar elemento a eliminar
     devuelve nueva tabla sin el elemento (o tabla original si no existe)
     */
    static int[] eliminar(int[] t, int aBorrar){
        // Busca el elemento con búsqueda dicotómica
        int indiceBorrado = Arrays.binarySearch(t, aBorrar);
        
        if(indiceBorrado >= 0){
            // Desplaza elementos posteriores hacia la izquierda
            System.arraycopy(t, indiceBorrado + 1, t, indiceBorrado, t.length - indiceBorrado - 1);
            
            // Reduce el tamaño de la tabla
            t = Arrays.copyOf(t, t.length - 1);
            
            System.out.println("Elemento " + aBorrar + " eliminado");
        } else {
            // Elemento no encontrado
            System.out.println("El elemento " + aBorrar + " no existe en la tabla");
        }
        
        return t;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Creo tabla ordenada inicial
        System.out.print("Cuantos elementos iniciales?: ");
        int tamano = sc.nextInt();
        
        int[] tabla = new int[tamano];
        
        System.out.println("\nIngrese " + tamano + " numeros ordenados:");
        for(int i = 0; i < tamano; i++){
            System.out.print("Numero " + (i + 1) + ": ");
            tabla[i] = sc.nextInt();
        }
        
        // Ordena por si acaso
        Arrays.sort(tabla);
        
        System.out.println("\nTabla inicial: " + Arrays.toString(tabla));
        
        //Pido elemento a eliminar
        System.out.print("\nQue numero desea eliminar?: ");
        int aBorrar = sc.nextInt();
        
        //Llamada a la funcion eliminar y guardo el resultado
        tabla = eliminar(tabla, aBorrar);
        
        //Muestro resultado
        System.out.println("\nTabla despues de eliminar: " + Arrays.toString(tabla));
        
    }
}
