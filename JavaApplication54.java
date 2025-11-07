/*
 Programa que busca un valor en un array de forma secuencial.
 Implementa búsqueda con bandera para mayor eficiencia.
 */
package javaapplication5.pkg4;

import java.util.Scanner;
//importando clase
public class JavaApplication54 {
    /*
     Busca un valor en un array de forma secuencial
     t array donde buscar
     clave valor a buscar
     devuelve posición de la primera ocurrencia (o -1 si no existe)
     */
   static int buscar(int t[], int clave){
       int devuelve=-1;
       boolean encontrado= false;
       int i=0;
       
       // Busca hasta encontrar o llegar al final
        while(i < t.length && !encontrado){
            if(t[i] == clave){
            devuelve = i;
            encontrado = true;
            }
            i++;
        }
        
        return devuelve;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tamano, clave;
        
        // Pido tamaño
        System.out.println("Tamano de la tabla: ");
        tamano= sc.nextInt();
        
        // Creo array
        int t[]=new int [tamano];
        
        // Rellenar array
        System.out.println("A continuacion rellene la tabla: ");
        for(int i=0; i < t.length; i++){
        System.out.println("Numero " + (i + 1) + ": ");
        t[i]= sc.nextInt();
        }
        
        // Pido valor a buscar
        System.out.println("Digite el valor a buscar: ");
        clave= sc.nextInt();
        
        // Buscar
        int encontrado=buscar(t, clave);
        
        // Muestro resultado
        if(encontrado != -1){
        System.out.println("El valor "+clave+ " ha sido encontrado en la posicion: "+ encontrado);
        }else
            System.out.println("El valor "+clave+ " no ha sido encontrado");
        
    }
}
