/*
Programa que solicita al usuario sus numeros favoritos y calcula su numero de la suerte
 */
package javaapplication5.pkg7;
//importando clases
import java.util.Arrays;
import java.util.Scanner;

public class JavaApplication57 {

    static int[] mediaArit(int [] favoritos, int seleccion1, int seleccion2){
        
        // Para evitar problemas de índice
        if (seleccion1 > seleccion2) {
            int temp = seleccion1;
            seleccion1 = seleccion2;
            seleccion2 = temp;
        }

        // Calculo media
        int media = (favoritos[seleccion1] + favoritos[seleccion2]) / 2;

        // Creo nuevo arreglo con 1 elemento menos
        int[] nuevo = new int[favoritos.length - 1];

        // Copio elementos antes del primero eliminado
        System.arraycopy(favoritos, 0, nuevo, 0, seleccion1);

        // Copio elementos entre los dos eliminados
        System.arraycopy(favoritos, seleccion1 + 1, nuevo, seleccion1, seleccion2 - seleccion1 - 1);

        // Copio los elementos después del segundo eliminado
        System.arraycopy(favoritos, seleccion2 + 1, nuevo, seleccion2 - 1, favoritos.length - seleccion2 - 1);

        // Inserto la media y ordeno después
        nuevo[nuevo.length - 1] = media;
        Arrays.sort(nuevo);
        
        // Devuelve nuevo arreglo
        return nuevo;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tamano;
        //Pido tamaño del arreglo
        System.out.println("Cuantos numeros favoritos tienes?: ");
        tamano = sc.nextInt();
        
        int[] favoritos = new int[tamano];
        
        //Pido rellenar el arreglo
        System.out.println("Ingrese los " + tamano + " numeros: ");
        
        for(int i=0; i < tamano; i++){
            System.out.println("Numero " + (i+1) + ": " );
            favoritos[i] = sc.nextInt();
        }
        
        //Seleccion de dos numeros random
        while(favoritos.length != 1){
            Arrays.sort(favoritos);
            
            int seleccion1 = (int)(Math.random() * favoritos.length);
            int seleccion2;

            do{
            seleccion2 = (int)(Math.random() * favoritos.length);
            }while(seleccion2==seleccion1);
           
            //Llamada de la funcion mediaArt
            favoritos=mediaArit(favoritos, seleccion1, seleccion2);
        }
        
        //Muestro numero de la suerte
        System.out.println("Tu numero de la suerte es: "+ favoritos[0]);
    }    
}
