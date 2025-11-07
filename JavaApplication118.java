/*
PROGRAMA QUE PIDE CANTIDAD DE ANIMALES CAPTURADOS
HORMIGAS
ARAÑAS
COCHINILLAS
SUMA SUS PATAS Y MUESTRA LA CANTIDAD DE PATAS EN TOTAL
 */
package javaapplication1.pkg18;
    //IMPORTANDO CLASE
    import java.util.Scanner;

public class JavaApplication118 {

    public static void main(String[] args) {
        // DELARANDO VARIABLE
        int patas = 0;
        
        //SALIDA CONSOLA PIDE CANTIDAD DE HORMIGAS
        System.out.println("Cantidad de hormigas capturadas: ");
        Scanner sc=new Scanner(System.in);
        patas+= sc.nextInt()*6;//CALCULA Y GUARDA
        
        //SALIDA CONSOLA PIDE CANTIDAD DE ARAÑAS
        System.out.println("Cantidad de arañas capturadas: ");
        patas+= sc.nextInt()*8;//CALCULA Y GUARDA
        
        //SALIDA CONSOLA PIDE CANTIDAD DE COCHINILLAS
        System.out.println("Cantidad de cochinillas capturadas: ");
        patas+= sc.nextInt()*14;//CALCULA Y GUARDA
        
        //SALIDA CONSOLA MUESTRA TOTAL DE PATAS
        System.out.println("Cantidad total de patas: " + patas);
        
    }
    
}
