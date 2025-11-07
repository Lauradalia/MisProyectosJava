/*
Programa que solicita al usuario que teclee n números
Realiza la media de los números positivos
Realiza la media de los números negativos
Cuenta el número de ceros introducidos
 */

package javaapplication5.pkg3;
//Importando clase
import java.util.Scanner;

public class JavaApplication53 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Pido tamaño
        System.out.print("Ingrese la cantidad de numeros: ");
        int tamano = sc.nextInt();
        
        //Variables para calcular
        int contadorPositivos = 0;
        double sumaPositivos = 0;
        int contadorNegativos = 0;
        double sumaNegativos = 0;
        int contadorCeros = 0;
        
        
        //Pido números y clasifico
        System.out.println("\nIngrese los " + tamano + " numeros:");
        for(int i = 0; i < tamano; i++){
            System.out.print("Numero " + (i+1) + ": ");
            double numeros = sc.nextDouble();
            
            if(numeros > 0){
                // Positivo
                sumaPositivos += numeros;
                contadorPositivos++;
            } else if(numeros < 0){
                // Negativo
                sumaNegativos += numeros;
                contadorNegativos++;
            } else {
                // Cero
                contadorCeros++;
            }
        }
        
        
        // Calculo y muestro medias
        if(contadorPositivos > 0){
            double mediaPositivos = sumaPositivos / contadorPositivos;
            System.out.println("\nMedia de positivos: " + mediaPositivos);
        } else {
            System.out.println("\nNo se ingresaron numeros positivos");
        }
        
        if(contadorNegativos > 0){
            double mediaNegativos = sumaNegativos / contadorNegativos;
            System.out.println("Media de negativos: " + mediaNegativos);
        } else {
            System.out.println("No se ingresaron numeros negativos");
        }
        
        //Muestro cantidad de ceros
        System.out.println("Cantidad de ceros: " + contadorCeros);
        
    }
}
