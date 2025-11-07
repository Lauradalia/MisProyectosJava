/*
PROGRAMA QUE MUESTRA DOS NUMEROS ALEATORIOS Y UNA OPERACION ALEATORIA 
PIDE EL RESULTADO Y LO COMPRUEBA
*/
package javaapplication2.pkg18;

import java.util.Random;
import java.util.Scanner;


public class JavaApplication218 {

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        //DECLARANDO VARIABLES
        int num1= rand.nextInt(100);
        int num2 = rand.nextInt(100);
        int resultado=0;
        int signos=rand.nextInt(1,4);

        //MOSTRANDO NUM1 NUM2 Y SIGNOS DE FORMA RANDOM
        switch(signos){
            //SUMA
            case 1:{
                System.out.println("La operacion a realizar es: "+num1+" + "+num2);
                System.out.println("Introduce el resultado: ");
                resultado = sc.nextInt();//GUARDANDO RESULTADO
                //COMPROBANDO RESULTADO
                if(resultado==num1+num2){
                    System.out.println("El resultado es correcto");
                }
                else{
                    System.out.println("El resultado es incorrecto");
                }
                break;
            }
            //RESTA
            case 2:{
                System.out.println("La operacion a realizar es: "+num1+" - "+num2);
                System.out.println("Introduce el resultado: ");
                resultado = sc.nextInt();//GUARDANDO RESULTADO
                //COMPROBANDO RESULTADO
                if(resultado==num1-num2){
                    System.out.println("El resultado es correcto");
                }
                else{
                    System.out.println("El resultado es incorrecto");
                }
                break;
            }
            //MULTIPLICACION
            case 3:{
                System.out.println("La operacion a realizar es: "+num1+" * "+num2);
                System.out.println("Introduce el resultado: ");
                resultado = sc.nextInt();//GUARDANDO RESULTADO
                //COMPROBANDO RESULTADO
                if(resultado==num1*num2){
                    System.out.println("El resultado es correcto");
                }
                else{
                    System.out.println("El resultado es incorrecto");
                }
                break;
            }
        }
       
    }
    
}
