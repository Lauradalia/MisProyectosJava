//PROGRAMA QUE COMPRUEBA SI UN NUMERO ENTRADO POR EL USUARIO ES POSITIVO DEVOLVIENDO TRUE O FALSE SI ES NEGATIVO

package javaapplication2.pkg2;
//IMPORTANDO CLASE
import java.util.Scanner;

public class JavaApplication22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //SALIDA CONSOLA PIDE NUMERO
        System.out.println("Introduzca un numero");
        
        //DECLARANDO VARIABLE Y GUARDANDO NUMERO
        int numero = sc.nextInt();
        
        //COMPROBANDO SI NUMERO MAYOR O IGAL A CERO
        if (numero >=0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    
}
