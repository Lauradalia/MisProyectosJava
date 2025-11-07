/*
PROGRAMA QUE DETERMINA SI LA COMIDA DIARIA DE UNA GRANJA ES SUFICIENTE 
O NO TENIENDO EN CUENTA LA CANTIDA DE ANIMALES Y LA CANTIDAD QUE COMEN
*/
package javaapplication2.pkg13;
//IMPORTANDO CLASES
import java.util.Scanner;

public class JavaApplication213 {

    public static void main(String[] args) {
        //DECLARANDO VARIABLES
        float comidaDiaria;
        float kilosPorAnimal;
        int numAnimales;

        //SALIDA CONSOLA PIDE CANTIDAD DE COMIDA DIARIA
        System.out.println("indique la cantidad de comida diaria");
        Scanner sc = new Scanner(System.in);
        comidaDiaria = sc.nextFloat();//GUARDANDO

        //SALIDA CONSOLA PIDE CANTIDAD DE ANIMALES
        System.out.println("indique la cantidad de animales");
        numAnimales = sc.nextInt();//GUARDANDO

        //SALIDA CONSOLA PIDE LA CANTIDAD DE COMIDA POR ANIMAL
        System.out.println("indique la cantidad de kg de comida por animal");
        kilosPorAnimal = sc.nextFloat();//GUARDANDO

        //CALCULANDO Y MOSTRANDO SI LA COMIDA ES SUFICIENTE O NO
        if ((numAnimales * kilosPorAnimal) <= comidaDiaria) {
            System.out.println("La comida es suficiente ");
        }else  {
            System.out.println("La comida es insuficiente \n");
            System.out.println("La cantidad de comida que les corresponde es: "+ (comidaDiaria/numAnimales) +" kilos por animal");
        }

    }
    
}
