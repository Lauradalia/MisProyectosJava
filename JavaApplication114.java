/*
PROGRAMA PARA CALCULAR EL AREA DE UN TRIANGULO, PIDE LOS DATOS ALTURA Y BASE Y DEVUELVE EL RESULTADO, EL AREA.
*/
package javaapplication1.pkg14;

//IMPORTANDO CLASES A UTILIZAR
import java.util.Scanner;
import java.util.Locale;

public class JavaApplication114 {

    public static void main(String[] args) {
        
        //DECLARACION DE VARIABLES
       double base = 0;
       double altura = 0;
       
       //SALIDA CONSOLA PEDIDO DE BASE
        System.out.println("Entre la base del triangulo y presione intro: "); 
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.US);
        base=sc.nextDouble();
        
        //SALIDA CONSOLA PEDIDO DE ALTURA
        System.out.println("Entre la altura del triangulo y presione intro: "); 
        altura=sc.nextDouble();
        
        //SALIDA CONSOLA AREA DE TRIANGULO
        System.out.println("El area del triangulo es: " + (base * altura)/2); 
    }
    
}
