/*
 * Programa que verifica si dos números enteros positivos son amigos.
 * Dos números son amigos si la suma de los divisores propios de cada uno
 * es igual al otro número.
 */
package javaapplication4.pkg17;

import java.util.Scanner;

public class JavaApplication417 {
    
    /**
     * Calcula la suma de los divisores propios de un número
     * Divisores propios: todos los divisores excepto el número mismo
     * @param numero número del cual calcular la suma de divisores propios
     * @return suma de los divisores propios
     */
    public static int sumaDivisoresPropios(int numero) {
        int suma= 0;
        
        // Recorremos desde 1 hasta numero-1 (divisores propios)
        for(int i = 1; i < numero; i++){
            // Si i es divisor de numero
            if(numero%i == 0){
                suma = suma + i;
            }
        }
        
        return suma;
    }
    
    /*
     Funcion que verifica si dos números son amigos
     a primer número
     b segundo número
     devuelve true si son amigos, false si no lo son
     */
    public static boolean numAmigos(int a, int b) {
        int sumaA;
        int sumaB;
        
        // Calculamos la suma de divisores propios de cada número
        sumaA = sumaDivisoresPropios(a);
        sumaB = sumaDivisoresPropios(b);
        
        // Son amigos si sumaA es igual a b Y sumaB es igual a a
        if(sumaA ==b && sumaB==a){
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Ingrese el primer número: ");
        num1 = sc.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        num2 = sc.nextInt();
        
        // Verificamos si son amigos
        if(numAmigos(num1, num2)){
            System.out.println(num1 + " y " + num2 + " son números amigos");
        } else {
            System.out.println(num1 + " y " + num2 + " NO son números amigos");
        }
        
    }
}
