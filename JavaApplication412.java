/*
FUNCION QUE CALCULA Y DEVUELVE LA DISTANCIA EUCLIDEA QUE SEPARA LOS PUNTOS
X1 Y1
X2 Y2
 */
package javaapplication4.pkg12;
//Importando clase
import java.util.Scanner;

public class JavaApplication412 {
    // Función que calcula y DEVUELVE LA DISTANCIA EUCLIDEA
    public static double distancia(double x1, double y1, double x2, double y2){
    // Declarando variables locales de la función
    double resultado;
    double dx;//para(x1-x2)
    double dy;//para(y1-y2)
    
    dx= x1-x2;
    dy= y1-y2;
    
    //calculando...
    resultado=Math.sqrt(Math.pow(dx, 2) + Math.pow(dy,2));
    
    //Devolviendo valor
    return resultado;
    }

    public static void main(String[] args) {
        //Declarando variables locales del main
        double x1, y1,x2, y2;
        double dist;
        
        //Salida consola pidiendo datos
        System.out.println("Ingresa x1: ");
        Scanner sc=new Scanner(System.in);
        x1 = sc.nextDouble();//Guardado
        
        System.out.println("Ingresa y1: ");
        y1 = sc.nextDouble();//Guardado
        
        System.out.println("Ingresa x2: ");
        x2 = sc.nextDouble();//Guardado
        
        System.out.println("Ingresa y2: ");
        y2 = sc.nextDouble();//Guardado
        
        //llamada a la funcion
        dist=distancia(x1, y1, x2, y2);
        //Salida consola muestra la distancia
        System.out.println("La distancia es: " + dist);
    }
    
}
