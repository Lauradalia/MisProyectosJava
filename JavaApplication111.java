/*
PROGRAMA PARA REALIZAR CALCULOS CON EL IVA, SOLICITA LA BASE IMPONIBLE Y TAMBIEN EL IVA
LUEGO MUESTRA EL IVA APLICADO Y EL IMPORTE TOTAL
*/
package javaapplication1.pkg11;
//IMPORTANDO CLASES
import java.util.Scanner;

public class JavaApplication111 {

    public static void main(String[] args) {
      //DECLARANDO VARIABLES
      float  precio = 0;
      float IVA = 0;
      
      //SALIDA CONSOLA PIDE PRECIO
      System.out.println("Ingrese el precio y presione intro: ");
      Scanner sc= new Scanner(System.in);
      precio=sc.nextFloat();
      
      //SALIDA CONSOLA PIDE IVA
      System.out.println("Ingrese el IVA a aplicar en numero entero y presione intro: ");
      IVA=sc.nextFloat();
      
      //CAMBIANDO IVA A DECIMAL
      IVA=IVA/100;
        
      //SALIDA CONSOLA IMPORTE TOTAL + PORCENTAJE DE IVA APLICADO
        System.out.println("El precio total del producto es: " + (precio*IVA+precio) + "\nY el IVA aplicado fue del: " + IVA*100 + "%");
      
      
    }
    
}
