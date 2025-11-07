/*
Funcion que calcula la diferencia en minutos entre dos instantes de tiempo
SOLICITA LOS SIGUIENTES DATOS
hora1 hora del primer instante
minuto1 minutos del primer instante
hora2 hora del segundo instante
minuto2 minutos del segundo instante
DEVUELVE:
diferencia en minutos (siempre positiva)
 */
package javaapplication4.pkg15;
//IMPORTANDO CLASE
import java.util.Scanner;

public class JavaApplication415 {

    static int diferenciaMin(int hora1,int minuto1, int hora2,int minuto2){
        // Declarando variables locales de la función
        int minutosInstante1;//HORA1+MINUTO1
        int minutosInstante2;//HORA2+MINUTO2
        int diferencia;
        
        //LLEVANDO DE HORAS A MINUTOS Y SUMANDO MINUTOS
        minutosInstante1 = (hora1*60)+ minuto1;
        minutosInstante2 = (hora2*60)+ minuto2;
        
        //CALCULANDO LA DIFERENCIA DE MINUTOS
        diferencia = minutosInstante1 - minutosInstante2;

        return Math.abs(diferencia);//DEVUELVE EL VALOR ABSOLUTO DE LA DIFERENCIA
    }
    public static void main(String[] args) {
        //Declarando variables locales del main
        Scanner sc = new Scanner(System.in);
        int hora1, minuto1, hora2, minuto2;
        int resultado;
        
        //SALIDA CONSOLA SOLICITA HORA 1 MINUTO1 HORA2 MINUTO2
        System.out.println("*** INSTANTE 1 ***");
        System.out.print("Ingrese hora: ");
        hora1 = sc.nextInt();
        System.out.print("Ingrese minutos: ");
        minuto1 = sc.nextInt();
        
        System.out.println("\n*** INSTANTE 2 ***");
        System.out.print("Ingrese hora: ");
        hora2 = sc.nextInt();
        System.out.print("Ingrese minutos: ");
        minuto2 = sc.nextInt();
        
        // Llamar a la función
        resultado = diferenciaMin(hora1, minuto1, hora2, minuto2);
        
        //SALIDA CONSOLA MUESTRA LA DIFERENCIA EN MINUTOS
        System.out.println("\nDiferencia en minutos: " + resultado);
    }
    
}
