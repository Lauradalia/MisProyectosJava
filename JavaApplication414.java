 /*
    Fncion que calcula la cantidad total de segundos a partir de días, horas y minutos
    pide cantidad de días
    pide cantidad de horas
    pide cantidad de minutos
    devuelve total de segundos
 */
package javaapplication4.pkg14;

import java.util.Scanner;
//importando clase
public class JavaApplication414 {
    
    //Fncion que calcula la cantidad total de segundos a partir de días, horas y minutos
    public static int cantidadSegundos(int dias, int horas, int minutos) {
        // Declarando variables locales de la función
        int segundosDias;      // Segundos de los días
        int segundosHoras;     // Segundos de las horas
        int segundosMinutos;   // Segundos de los minutos
        int totalSegundos;     // Total
        
        // Convertir días a segundos (1 día = 86400 segundos)
        segundosDias = dias * 86400;
        
        // Convertir horas a segundos (1 hora = 3600 segundos)
        segundosHoras = horas * 3600;
        
        // Convertir minutos a segundos (1 minuto = 60 segundos)
        segundosMinutos = minutos * 60;
        
        // sumando
        totalSegundos = segundosDias + segundosHoras + segundosMinutos;
        
        return totalSegundos;  // Devolver el resultado
    }
    
    public static void main(String[] args) {
        //Declarando variables locales del main
        Scanner sc = new Scanner(System.in);
        int dias, horas, minutos;
        int resultado;
        
        //Salida consola pide cantidad de dias horas y minutos
        System.out.print("Ingrese cantidad de días: ");
        dias = sc.nextInt();
        
        System.out.print("Ingrese cantidad de horas: ");
        horas = sc.nextInt();
        
        System.out.print("Ingrese cantidad de minutos: ");
        minutos = sc.nextInt();
        
        // Llamar a la función y guardar el resultado
        resultado = cantidadSegundos(dias, horas, minutos);
        
        //Salida consola muestra resultado
        System.out.println("\nTotal de segundos: " + resultado);
        
    }
}
