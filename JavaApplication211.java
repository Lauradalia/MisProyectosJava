/*
PROGRAMA QUE PIDE UN NUMERO Y DICE SI ES CAPICUA O NO
*/
package javaapplication2.pkg11;

import java.util.Scanner;

public class JavaApplication211 {

    public static void main(String[] args) {
         //DECLARANDO VARIABLES
        int unidades;
        int decenas;
        int centenas;
        int millar;
        int numero;

        //SALIDA DE CONSOLA PIDE NUMERO
        System.out.println("Entre un numero de hasta 4 digitos entre 0 y 9999: ");
        Scanner sc = new Scanner(System.in);
        numero=sc.nextInt();//LO GUARDA

        //VALORA LA CANTIDAD DE DIGITOS
        if(numero>9999){
            System.out.println("El numero es de mas de 4 digitos");
        }
        //COMPROBANDO SI NUMERO ES 1 DIGITO
        else if (0 <= numero &&  numero <= 9) {
            System.out.println("Si es capicua");
        } else if (10<=  numero &&  numero <= 99) {//COMPROBANDO SI NUMERO ES 2 DIGITOS
            unidades =  numero % 10;//SEPARANDO UNIDAD
            decenas = numero / 10;//SEPARANDO DECENA
            if (unidades == decenas)//COMPARANDO DECENAS Y UNIDADES
                System.out.println(" Si es capicua");
            else
                System.out.println("No es capicua");
        }else if (100<=  numero &&  numero <= 999) {//COMPROBANDO SI NUMERO ES 3 DIGITOS
            unidades=numero%10;//SEPARANDO UNIDAD
            centenas = numero/100;//SEPARANDO CENTENAS
            if (unidades == centenas)//COMPARANDO DECENAS Y UNIDADES
                System.out.println("Si es capicua");
            else
                System.out.println("No es capicua");
        } else {//SI NO ES NINGUNA DE LAS ANTERIORES PUES SERA UN NUMERO DE 4 CIFRAS
            unidades=numero%10;//SEPARANDO UNIDAD
            decenas = (numero%100)/10;//SEPARANDO DECENAS
            centenas = (numero/100)%10;//SEPARANDO CENTENAS
            millar = numero/1000;//SEPARANDO MILLAR
            if (unidades == millar && decenas == centenas) {//COMPARANDO QUE UNIDADES SEA IGUAL A MILLAR Y DECENAS IGUAL A CENTENAS
                System.out.println("Si es capicua");
            }else
                System.out.println("No es capicua");
      }
    }
 }
  
