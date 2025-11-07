/*PIDE AL USUARIO DOS NUMEROS Y DEVUELVE TRUE SI SON DISTINTOS ENTRE SI O UNO DE ELLOS ES 0
EN CASO CONTRARIO DEVUELVE FALSO*/

package javaapplication2.pkg3;
//IMPORTANDO CLASE
import java.util.Scanner;


public class JavaApplication23 {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //SALIDA CONSOLA PIDE PRIMER NUMERO
        System.out.println("Intrese el primer numero: ");
        int num1 = sc.nextInt();//CREANDO VARIABLE Y GUARDANDO NUMERO1
        
        //SALIDA CONSOLA PIDE SEGUNDO NUMERO
        System.out.println("Intrese el segundo numero: ");
        int num2 = sc.nextInt();//CREANDO VARIABLE Y GUARDANDO NUMERO2
        
        //COMPROBANDO SI NUM1 DIFERENTE DE NUM2 O ALGUNO DE LOS DOS ES CERO
        if (num1 != num2 ||(num1==0) || num2 == 0) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
    
}
