/*
Programa que muestra todos los divisores primos de un número dado.
Utiliza una función auxiliar para verificar si un número es primo.
 */
package javaapplication4.pkg16;
//importando clase
import java.util.Scanner;

public class JavaApplication416 {
    
    // FUNCIÓN AUXILIAR: Verifica si un número es primo
    //n número a verificar
    public static boolean esPrimo(int n) {
        //Números menores que 2 no son primos (se maneja implícitamente en el bucle)
        // Buscamos divisores desde 2 hasta n-1
       for(int i=2;i<n;i++){
           //true si es primo, false si no lo es
        if(n % i ==0){
            return false;
        }   
       }
       return true;
    }
    
    // FUNCIÓN PRINCIPAL: Muestra por consola todos los divisores primos de un número
    //(numero) número del cual se buscan los divisores primos
    public static void divisoresPrimos(int numero) {
        System.out.println("Los divisores primos de "+ numero + " son: ");
        // Recorremos desde 2 hasta el número
        for(int i=2;i<=numero;i++){
            // Verificamos si i es divisor de numero
            if(numero%i==0){
                // Si es divisor, verificamos si además es primo
                if(esPrimo(i)){
                    System.out.println(i);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // declarando variable local del main
        int entrada;
        // Salida consola pide número al usuario
        System.out.println("Introduzca un numero: ");
        Scanner sc=new Scanner(System.in);
        entrada = sc.nextInt();
        //llamar a divisoresPrimos() para mostrar los divisores primos
        divisoresPrimos(entrada);
    }
}

