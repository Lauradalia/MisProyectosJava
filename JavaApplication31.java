/*
PROGRAMA QUE MUESTRA LA EDAD MAXIMA Y MINIMA DE UN CONJUNTO DE EDADES
SOLICITADAS AL USUARIO
HASTA QUE EL USUARIO INTRODUZCA -1
 */
package javaapplication3.pkg1;
//Importando clase
import java.util.Scanner;

public class JavaApplication31 {

    public static void main(String[] args) {
        //Declarando variables
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int edadMaxima = 0;
        int edadMinima = 0;
        int entrada;
        
        //
        System.out.println("Ingrese una edad");
        entrada = sc.nextInt();//lo guarda
            
        //    
        if (entrada == -1){
            //Salida consola que muestra que se finaliza el programa si el primer numero es -1
            System.out.println("No se entraron numeros validos se ha terminado el programa...");
            flag = false;
        }else{
            //Si el primer numero no es -1 las edades se igualan al numero entrado
            edadMaxima=entrada;
            edadMinima=entrada;
        //Mientras q flag sea true:
        while (flag) {
            //Salida consola pide edades
            System.out.println("Ingrese una edad");
            entrada = sc.nextInt();//lo guarda
            
            //Si el numero es -1 se termina el programa
            if (entrada == -1){
                System.out.println("Se ha terminado el programa...");
                flag = false;
            }
            
            //Valora si entrada es mayor q edadMaxima
            if (entrada > edadMaxima && entrada !=-1 ) {
                //la entrada se guarda en edadMaxima
                edadMaxima = entrada;
            //Valora si entrada es menor q edadMinima
            }
            if ( entrada < edadMinima  && entrada!=-1){
                //la entrada se guarda en edadMinima
                edadMinima = entrada;
                }
  
        }
        
        //Salida consola muestra edad maxima y edad minima
        System.out.println("El edad maxima es: " + edadMaxima);
        System.out.println("El edad minima es: " + edadMinima);
        }
    }
        
}
