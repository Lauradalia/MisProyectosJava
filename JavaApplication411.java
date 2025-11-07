/*FUNCION QUE CALCULA Y MUESTRA LA SUPERFICIE Y VOLUMEN DE UNA ESFERA
SOLICITANDO EL RADIO*/

package javaapplication4.pkg11;
//Importando clase
import java.util.Scanner;

public class JavaApplication411 {
    
    // Función que calcula y muestra superficie y volumen de esfera
    public static void calcularEsfera(double radio) {
        // Declarando variables locales de la función
        double superficie;  
        double volumen;
        
        //Calculando...
        superficie = 4 * Math.PI * Math.pow(radio, 2);
        volumen = (4.0 * Math.PI / 3.0) * Math.pow(radio, 3);
        
        //Salida consola de superficie y volumen de esfera
        System.out.println("Superficie: " + superficie);
        System.out.println("Volumen: " + volumen);
    }
    
    public static void main(String[] args) {
        double radio;    // Declarando variable local del main
        
        //Salida consola pide radio
        System.out.println("Ingresa el radio de la esfera: ");
        Scanner sc = new Scanner(System.in);
        radio = sc.nextDouble();  // Guarda radio
        
        calcularEsfera(radio);  // Llamada a la función
    }
}
