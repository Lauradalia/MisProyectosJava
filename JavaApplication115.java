/*
PROGRAMA QUE RESUELVE POLINOMIO, PIDE COEFICIENTES Y DEVUELVE EL VALOR CORRESPONDIENTE DEL POLINOMIO.
 */
package javaapplication1.pkg15;

    //IMPORTANDO CLASES 
    import java.util.Scanner; 
    import java.util.Locale;

public class JavaApplication115 {

    public static void main(String[] args) {
        
        //DECLARANDO VARIABLES 
        float coeficienteA = 0; 
        float coeficienteB = 0; 
        float coeficienteC = 0; 
        float coeficienteX = 0; 
        
        //SALIDA CONSOLA PEDIDO DE coeficienteA 
        System.out.println("Entre el coeficiente A y presione intro: "); 
        Scanner sc=new Scanner(System.in); 
        sc.useLocale(Locale.US); 
        coeficienteA =sc.nextFloat(); 
        
        //SALIDA CONSOLA PEDIDO DE coeficienteB 
        System.out.println("Entre el coeficiente B y presione intro: "); 
        coeficienteB =sc.nextFloat();
        
        //SALIDA CONSOLA PEDIDO DE coeficienteC
        System.out.println("Entre el coeficiente C y presione intro: "); 
        coeficienteC =sc.nextFloat();
        
        //SALIDA CONSOLA PEDIDO DE coeficienteX
        System.out.println("Entre el coeficiente X y presione intro: "); 
        coeficienteX =sc.nextFloat();
        
        //CALCULANDO POLINOMIO
        double resultado = coeficienteA * Math.pow(coeficienteX, 2) + coeficienteB * coeficienteX + coeficienteC;
        
        //SALIDA CONSOLA DEVUELVE VALOR DE POLINOMIO 
        System.out.println("El resultado del polinomio es: " +  resultado); 
    }
    
}
