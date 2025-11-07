/*
PROGRAMA QUE TOMA UN NUMERO ENTERO E INDICA QUE CANTIDAD HAY Q SUMARLE PARA Q ESTE SEA MULTIPLO DE 7
*/
package javaapplication1.pkg12;

//IMPORTANDO CLASES
import java.util.Scanner;

public class JavaApplication112 {

    public static void main(String[] args) {
        //DECLARANDO VARIABLE
        int numero = 0;
        
        //SALIDA CONSOLA PEDIDO DE NUMERO ENTERO
        System.out.println("Entre un numero entero y presione intro: ");
        Scanner sc= new Scanner(System.in);
        numero=sc.nextInt();
        
        //SALIDA CONSOLA CANTIDAD A SUMAR PARA SER MULTIPLO DE 7
        System.out.println("Al numero le falta: " + (7-(numero%7))%7 + " para ser multiplo de 7");
    }
    
}
