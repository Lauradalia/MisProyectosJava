/*
PROGRAMA QUE PIDE DOS NUMEROS Y DETERMINA SU IGUALDAD MOSTRANDO 
TRUE PARA IGUALES
FALSE PARA DESIGUAL
 */
package javaapplication1.pkg21;

    //IMPORTANDO CLASES
    import java.util.Scanner; 
    import java.util.Locale;

public class JavaApplication121 {

    public static void main(String[] args) {

        //DECLARANDO VARIABLES
        double numeroA = 0;
        double numeroB = 0;
        boolean resultado ;//VARIABLE QUE DEVUELVE AUTOMATICAMENTE TRUE O FALSE
        
        //SALIDA CONSOLA PIDE UN NUMERO
        System.out.println("Digite un numero: ");
        Scanner sc=new Scanner(System.in); 
        sc.useLocale(Locale.US);
        numeroA = sc.nextDouble();//GUARDA NUMERO
        
        //SALIDA CONSOLA PIDE UN SEGUNDO NUMERO
        System.out.println("Digite otro numero: ");
        numeroB = sc.nextDouble();//GUARDA SEGUNDO NUMERO
        
        //DETERMINANDO IGUALDAD ENTRE NUMEROS
        resultado = (numeroA == numeroB);
        
        //SALIDA CONSOLA MUESTRA TRUE O FALSE
        System.out.println(resultado);

    }
   
    
}
