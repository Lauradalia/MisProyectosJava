/*
PROGRAMA QUE MUESTRA DOS NUMEROS ALEATORIOS, PIDE LA SUMA, Y VERIFICA EL RESULTADO
*/
package javaapplication2.pkg17;

//IMPORTANDO CLASES
import java.util.Random;
import java.util.Scanner;

public class JavaApplication217 {

    public static void main(String[] args) {
        //DECLARANDO VARIABLES
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int n = rand.nextInt(100);
        int m = rand.nextInt(100);
        
        //SALIDA CAONSOLA MUESTRA LA OPERACION A REALIZAR
        System.out.println("Juguemos a sumar los siguientes numeros: ");
        System.out.println(n+" "+m);
        
        //SALIDA CONSOLA PIDE RESULTADO
        System.out.println("Introduzca el resultado de la suma");
        int resultado = sc.nextInt();//GUARDA EL RESULTADO EN NUEVA VARIABLE RESULTADO
        
        //COMPROBACION DEL RESULTADO
        if(resultado==(n+m)){
            System.out.println("El resultado es correcto");
        }else
            System.out.println("El resultado es incorrecto");

    }
    
}
