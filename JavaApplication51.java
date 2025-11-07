/*
Programa que crea tres tablas de diferentes tipos
y muestra sus referencias en memoria.
 */
package javaapplication5.pkg1;

public class JavaApplication51 {

    public static void main(String[] args) {
        // Creo tablas de 5 elementos cada una
        int tEnteros[]=new int [5];
        double tReales[]=new double[5];
        boolean tFlag[]=new boolean[5];
        
        // Muestro referencias (direcciones de memoria)
        System.out.println("Referencia tabla enteros: " +tEnteros);
        System.out.println("Referencia tabla reales: " +tReales);
        System.out.println("Referencia tabla booleanos: " +tFlag);
    }
    
}
