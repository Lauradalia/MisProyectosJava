/*
Programa que pide al usuario un numero y muestra en pantalla la salida Eco...
tantas veces como indique el numero introducido
 */
package javaapplication3.pkg2;

//IMPORTANDO CLASE
import java.util.Scanner;

public class JavaApplication32 {
    
    public static void main(String[] args) {
        //DECLARANDO VARIABLE
      int numero;
      
      //SALIDA CONSOLA PIDE UN NUMERO ENTERO
        System.out.println("Entre un mumero entero y presione enter: ");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();//LO GUARDA
        
        //CICLO QUE MUESTRA ECO.. TANTAS VECES COMO EL NUMERO DE ENTRADA
        for(int i=0;i<numero;i++){
            System.out.println("Eco...");
        }
    }
    
}
