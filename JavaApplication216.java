/*
PROGRAMA QUE PIDE UN NUMERO Y MUESTRA SU VALOR ABSOLUTO
*/

package javaapplication2.pkg16;

import java.util.Scanner;

public class JavaApplication216 {


    public static void main(String[] args) {
        //DECLARANDO VARIABLES
        int num;
        int absoluto;
        
        //SALIDA CONSOLA PIDE NUMERO
        System.out.print("Ingrese un número: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();//LO GUARDA
        
        //BUSCANDO Y MOSTRANDO EL VALOR ABSOLUTO
        absoluto = num < 0 ? java.lang.Math.abs(num) : num;
        System.out.println("El valor absoluto del numero es: "+absoluto);

    }
    
}
