/*
PROGRAMA QUE SOLICITA UN NUMERO REAL Y CALCULA SU RAIZ UTILIZANDO EL NOMBRE CUALIFICADO DE LAS CLASES
 */
package javaapplication1.pkg20;

    //IMPORTANDO CLASE
    import java.util.Scanner;

public class JavaApplication120 {

    public static void main(String[] args) {
        
        // DECLARANDO VARIABLES
        double numero = 0;
        double resultado = 0;
        
        // SALIDA CONSOLA PIDE NUMERO REAL
        System.out.println("Introduzca un numero real para saber su raiz cuadrada: ");
        Scanner sc= new Scanner(System.in);
        numero = sc.nextDouble();//GUARDANDO NUMERO
        resultado = java.lang.Math.sqrt(numero);//CALCULANDO LA RAIZ CUADRADA Y GUARDANDOLA
        
        //SALIDA CONSOLA MUESTRA LA RAIZ CUADRADA DEL NUMERO INTRODUCIDO
        System.out.println("La raiz cuadrada de " + numero + " es: " + resultado);
    }
  
    
    
}
