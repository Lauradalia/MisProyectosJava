/*
PROGRAMA QUE TOMA COMO ENTRADA DOS NUMEROS ENTEROS E INDICA QUE CANTIDAD LE FALTA AL NUMERO PARA SER MULTIPLO DEL DIVISOR
*/
package javaapplication1.pkg13;
//IMPORTANDO CLASES
import java.util.Scanner;

public class JavaApplication113 {

    public static void main(String[] args) {
        //DECLARANDO VARIABLES
       int numero = 0;
       int divisor = 0;
        
       //SALIDA CONSOLA PIDIENDO NUMERO
        System.out.println("Entre un numero entero (n) y presione intro: ");
        Scanner sc= new Scanner(System.in);
        numero=sc.nextInt();
        
        //SALIDA CONSOLA PIDIENDO DIVISOR
        System.out.println("Entre un numero entero (m) y presione intro: ");
        divisor=sc.nextInt();
        
        //SALIDA CONSOLA CANTIDAD FALTANTE 
        System.out.println("Al numero (n) " + numero + " le falta: " + (divisor -( numero % divisor ))% divisor + " para ser multiplo de (m) "+ divisor);
    }
    
}
