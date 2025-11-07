/*
PROGRAMA QUE CALCULA EL AREA DEL TRIANGULO SI BASE Y ALTURA SON POSITIVOS
*/
package javaapplication2.pkg15;

import java.util.Scanner;


public class JavaApplication215 {

   public static void main(String[] args) {
        //DECLARANDO VARIABLES
        double base;
        double altura;

        //SALIDA CONSOLA PIDE BASE
        System.out.println("Entre la base del triangulo");
        Scanner sc = new Scanner(System.in);
        base = sc.nextDouble();//GUARDANDO

        //SALIDA CONSOLA PIDE ALTURA
        System.out.println("Entre la altura del triangulo");
        altura = sc.nextDouble();//GUARDANDO

        //COMPROBANDO SI NO SON NEGATIVOS
        if (base>=0 && altura >= 0) {
            System.out.println("El area del triangulo es: "+(base*altura)/2);//MUESTRA Y CALCULA EL AREA DEL TRIANGULO
        }else  {
            System.out.println("Error uno de los dos numeros es negativo");//ERROR DE NUMEROS NEGATIVOS
        }
    }
    
}
