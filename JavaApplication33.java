/*
PROGRAMA QUE PIDE AL USUARIO UN NUMERO POSITIVO Y LO MUESTRA GUARISMO A GUARISMO
*/
package javaapplication3.pkg3;

//IMPORTANDO CLASE
import java.util.Scanner;

public class JavaApplication33 {

    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     //DECLARANDO VARIABLES
     int numero=0;
     boolean positivo =true;

        //Salida consola pide al usuario un número positivo
        System.out.print("Ingrese un numero positivo: ");
        numero = scanner.nextInt();
        
        //Valora si el numero es igual a 0 y pide un numero mayor a 0
        if(numero==0){
            System.out.println("El numero es 0");
            System.out.print("Ingrese un numero mayor a 0: ");
            numero = scanner.nextInt();
        }
        
        //Valora si el numero es negativo y pide un numero positivo
        if(numero<0){
            System.out.println("El numero es negativo");
            System.out.print("Ingrese un numero positivo: ");
            numero = scanner.nextInt();
        }
        
        //Salida consola
        System.out.println("Guarismos del numero (en orden inverso):");
        
        
        //Mientras Positivo es true se cumple que
        while (positivo){
             
            //Mientras numero mayor a 0 
            while (numero > 0) {
                int guarismo = numero % 10;  // Obtiene el último dígito de cada iteracion
                
                //Salida consola muestra guarismo a guarismo
                System.out.println(guarismo);
                
                numero = numero / 10;        // Eliminando el último dígito de cada iteracion

            }
            
            //Cuando la iteracion valga 0, positivo sera igual a false y termina el programa
            if(numero==0){
                positivo=false;
            }
        }
    }
}
    
