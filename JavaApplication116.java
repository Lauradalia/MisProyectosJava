/*
PROGRAMA QUE SOLICITA LA ENTRADA DE UNA CANTIDAD DE SEGUNDOS Y 
DEVUELVE LA CANTIDAD DE HORAS MINUTOS Y SEGUNDOS Q HAY EN ESA CANTIDAD DE SEGUNDOS INTRODUCIDA
 */
package javaapplication1.pkg16;
    //IMPORTANDO CLASE
    import java.util.Scanner;

    public class JavaApplication116 {

        public static void main(String[] args) {
            
            // DECLARANDO VARIABLES
            int segundosEntrados = 0;
            int segundos = 0;
            int minutos = 0;
            int horas = 0;
            
            //SALIDA CONSOLA PIDE CANTIDAD DE SEGUNDOS
            System.out.println("introduzca una cantidad de segundos y pulse intro: ");
            Scanner sc=new Scanner(System.in);
            segundosEntrados = sc.nextInt();
            
            //OPERACIONES DE DESGLOSE HORAS MINUTOS Y SEGUNDOS
            segundos = segundosEntrados%60;
            minutos = segundosEntrados/60;
            horas = minutos/60;
            minutos%=60;
            
            //SALIDA CONSOLA MOSTRANDO DESGLOSE HORAS MINUTOS Y SEGUNDOS
            System.out.println("La cantidad de segundos introducida equivale a: \n" +horas +" Horas "+ minutos + " Minutos "+ segundos + " Segundos ");
        }
    
}
