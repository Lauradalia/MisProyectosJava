/*
Programa que solicita al usuario la cantidad de números pares a visualizar
y los muestra en consola utilizando una función dedicada.
 */
package javaapplication4.pkg13;
//Importando clase
import java.util.Scanner;

public class JavaApplication413 {
    
    // Función que muestra en consola los primeros n números pares
    public static void muestraPares(int n){
        // Declarando variable local de la función
        int par=2;// Primer número par
        //Generamos los n números pares incrementando de 2 en 2
        for(int i= 0; i< n; i++){
            System.out.println(par);
            par=par + 2;// Siguiente número par
        }
    }
    public static void main(String[] args) {
        //Declarando variable local del main
        int n;
        // Salida consola pide cantidad de pares
        System.out.println("Cuantos numeros pares desea ver?: ");
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();//Guardando
        // Validamos que el usuario ingrese un número válido
        if(n<=0){
            System.out.println("Por favor ingrese un numero positivo o mayor a 0...");
        }else{
            System.out.println("Los numeros pares son: ");
            muestraPares(n);
        }  
    }
    
}
