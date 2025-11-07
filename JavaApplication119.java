/*
PROGRAMA QUE CALCULA EL IMPORTE FINAL A COBRAR PIDE DOS TIPOS DE DATOS
CANTIDAD ENTRADA INFANTIL
CANTIDAD ENTRADA ADULTO
VALORA SI SE APLICA EL DESCUENTO DEL 5% 
MUESTRA SI SE APLICO O NO EL DESCUENTO Y EL IMPORTE FINAL
 */
package javaapplication1.pkg19;

    //IMPORTANDO CLASES
    import java.util.Scanner; 
    import java.util.Locale;

public class JavaApplication119 {

    public static void main(String[] args) {
        
        // DECLARANDO VARIABLES
        double Einfantil = 15.50;
        int Eadulto = 20;
        double importeFinal= 0;
        
        //SALIDA CONSOLA PIDE CANTIDAD DE ENTRADAS INFANTILES
        System.out.println("Cuantas entradas infantiles desea comprar?: ");
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.US);
        Einfantil *=sc.nextDouble();//GUARDA Y CALCULA
        
        //SALIDA CONSOLA PIDE CANTIDAD DE ENTRADAS ADULTOS
        System.out.println("Cuantas entradas de adultos desea comprar?: ");
        Eadulto *=sc.nextInt();//GUARDA Y CALCULA
        
        //VALORANDO SI APLICAR DESCUENTO
        importeFinal = ((Einfantil + Eadulto >= 100) ? ((Einfantil + Eadulto) * 0.95) : (Einfantil + Eadulto));
        
        //SALIDA CONSOLA SI SE APLICA O NO EL DESCUENTO E IMPORTE FINAL
        System.out.println((Einfantil+ Eadulto>=100)? ("Se aplico el descuento"): ("No se aplico el descuento"));
        System.out.println("El importe final a pagar es: " + importeFinal + " euros");
        
    }
    
}
