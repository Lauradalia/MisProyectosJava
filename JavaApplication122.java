/*
PROGRAMA QUE SOLICITA LA LONGITUD EN METROS CON TANTOS DECIMALES COMO DESEE
Y MUESTRA LA PARTE ENTERA EN CENTIMETROS
 */
package javaapplication1.pkg22;

    //IMPORTANDO CLASES
    import java.util.Scanner; 
    import java.util.Locale;

public class JavaApplication122 {

    public static void main(String[] args) {
        
        // DECLARANDO VARIABLES
        double longitud = 0;
        int longitudCM = 0;
        
        //SALIDA CONSOLA PIDE LONGITUD EN METROS
        System.out.println("Entre la longitud en metros: ");
        Scanner sc=new Scanner(System.in); 
        sc.useLocale(Locale.US); 
        longitud =sc.nextDouble()*100;//GUARDA Y CONVIERTE LA LONGITUD DE METROS A CENTIMETROS
        
        //CAMBIANDO EL TIPO DE DATO A LA VARIABLE LONGITUD 
        longitudCM=(int)longitud;
        
        //SALIDA CONSOLA MUESTRA PARTE ENTERA DE LA LONGITUD CONVERTIDA EN CENTIMETROS
        System.out.println("La longitud entera es: " + longitudCM + "cm");
        
    }
    
}
