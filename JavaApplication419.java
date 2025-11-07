/*
 Programa que muestra una serie de números aleatorios enteros.
 Versión sobrecargada: enteros en un rango o reales entre 0 y 1.
 */
package javaapplication4.pkg19;

import java.util.Scanner;

public class JavaApplication419 {
    
    /*
    Funcion sobrecargada muestra números aleatorios reales entre 0 y 1
    cantidad números aleatorios a generar
    */
    static void numAleatorios(int cantidad){
        double serieAleatoria;
        // Genera números aleatorios entre 0.0 y 1.0
        for(int i=0; i< cantidad;i++){
            serieAleatoria=(double) Math.random();
            System.out.println(serieAleatoria);
        }
    }
    
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
        int cantidad, vMin, vMax, opcion;
        
        // Solicitar cantidad
        System.out.println("Ingrese la cantidad de numeros aleatorios que desea ver: ");
        cantidad= sc.nextInt();
        
        // Validación: cantidad debe ser positiva
        while(cantidad <= 0){
            System.out.println("La cantidad debe ser mayor a 0");
            System.out.print("Ingrese la cantidad: ");
            cantidad = sc.nextInt();
        }
        
        // Menú de opciones
        System.out.println("Elija una opción:");
        System.out.println("  1 - Números aleatorios enteros (en un rango)");
        System.out.println("  2 - Números aleatorios reales (entre 0 y 1)");
        System.out.print("Opción: ");
        opcion= sc.nextInt();
        
        // Validar opción
        while(opcion != 1 && opcion != 2){
            System.out.println("️Opción inválida");
            System.out.print("Ingrese 1 o 2: ");
            opcion = sc.nextInt();
        }
        
        // Según la opción, llamar a la función correspondiente
        if(opcion==1){
            // Pedir rango
            System.out.println("Ingrese un valor minimo: ");
            vMin= sc.nextInt();

            System.out.println("Ingrese un valor maximo: ");
            vMax= sc.nextInt();
        
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
            // llamando a numAleatorios función sobrecargada con 3 parámetros
            numAleatorios(cantidad, vMin, vMax);
        }else{
            //Salida consola muestra los numeros aleatorios generados
            System.out.println("\n*** Números aleatorios generados ***");
            // llamando a numAleatorios función sobrecargada con 1 parámetro
            numAleatorios(cantidad);
        }
    }
}
