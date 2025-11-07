/*
PROGRAMA QUE COMPARA SI UN NUMERO ES DIVISIBLE POR EL OTRO
DEVUELVE TRUE SI SON DIVISIBLE Y FALSE EN CASO CONTRARIO
 */
package javaapplication2.pkg4;
//IMPORTANDO CLASES
import java.util.Scanner;


public class JavaApplication24 {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //SALIDA CONSOLA PIDE NUMERO1
        System.out.println("Ingrese el primer numero");
        int num = sc.nextInt();//CREANDO VARIABLE Y GUARDA NUMERO
        
        //SALIDA CONSOLA PIDE OTRO NUMERO
        System.out.println("Ingrese el otro numero");
        int num2 = sc.nextInt();//CREANDO VARIABLE Y GUARDA NUMERO
        
        //COMPARANDO NUMERO 1 CON NUMERO 2  PARA VER SI SON DIVISIBLES
        if(num%num2==0){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
    
}
