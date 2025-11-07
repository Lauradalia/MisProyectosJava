/*
PROGRAMA QUE PIDE TRES MEDIDAS 
CENTIMETRO
MILIMETRO
METRO
Y MUESTRA LA SUMA DE ELLAS EN CENTIMETROS
 */
package javaapplication1.pkg17;

    //IMPORTANDO CLASES
    import java.util.Scanner;
    import java.util.Locale;

public class JavaApplication117 {

    public static void main(String[] args) {
        // DECLARANDO VARIABLES
        float cm = 0;//centimetros
        
        //SALIDA CONSOLA PIDE MILIMETROS
        System.out.println("Introduzca la cantidad de milimetros: ");
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.US);
        cm=sc.nextFloat()/10;//LO CONVIERTE EN CENTIMETROS Y GUARDA EN VARIABLE CM
        
        //SALIDA CONSOLA PIDE CENTIMETROS
        System.out.println("Introduzca la cantidad de centimetros: ");
        cm+=sc.nextFloat();//LO SUMA CON LA VARIABLE CM Y GUARDA EN VARIABLE CM
        
        //SALIDA CONSOLA PIDE METROS
        System.out.println("Introduzca la cantidad de metros: ");
        cm+=sc.nextFloat()*100;// LO CONVIERTE EN CENTIMETROS Y GUARDA EN VARIABLE CM
        
        //SALIDA CONSOLA MUESTRA LA SUMA 
        System.out.println("La suma de las tres longitudes es: " + cm + " cm");
    }
    
}
