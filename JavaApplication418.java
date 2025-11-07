/*
 Programa que muestra una serie de números aleatorios enteros.
 El usuario especifica la cantidad y el rango (mínimo y máximo).
 */
package javaapplication4.pkg18;

import java.util.Scanner;

public class JavaApplication418 {
    /*
     Funcion que muestra una serie de números aleatorios en un rango dado
     cantidad números aleatorios a generar
     vMin valor mínimo del rango 
     vMax valor máximo del rango 
     */
    static void numAleatorios(int cantidad, int vMin, int vMax){
        //Variable local de la funcion
        int serieAleatoria;
        // Genera y muestra números aleatorios en el rango [vMin, vMax]
        for(int i=0; i< cantidad;i++){
            serieAleatoria=(int) (Math.random() * (vMax - vMin +1))+ vMin;
            System.out.println(serieAleatoria);
        }
    }
    public static void main(String[] args) {
        //Variables locales del main
        Scanner sc=new Scanner(System.in);
        int cantidad, vMin, vMax;
        
        //Salida consola pide vMin vMax y cantidad
        System.out.println("Ingrese un valor minimo: ");
        vMin= sc.nextInt();
        System.out.println("Ingrese un valor maximo: ");
        vMax= sc.nextInt();
        System.out.println("Ingrese la cantidad de numeros aleatorios que desea ver: ");
        cantidad= sc.nextInt();
        
        // Validación: cantidad debe ser positiva
        while(cantidad <= 0){
            System.out.println("La cantidad debe ser mayor a 0");
            System.out.print("Ingrese la cantidad: ");
            cantidad = sc.nextInt();
        }
        // Validación: vMax debe ser mayor  y difernte que vMin
        while(vMax <= vMin){
            System.out.println("Los valores introducidos son iguales o el valor minimo es mayor que el valor maximo");
            System.out.println("Ingrese un valor maximo: ");
            vMax= sc.nextInt();
            System.out.println("Ingrese un valor minimo: ");
            vMin= sc.nextInt();
        }
        //Salida consola muestra los numeros aleatorios generados
        System.out.println("\n*** Números aleatorios generados ***");
        // llamando a numAleatorios
        numAleatorios(cantidad, vMin, vMax);
    }
    
}
