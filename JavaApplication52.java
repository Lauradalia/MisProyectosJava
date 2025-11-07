/*
Programa que demuestra cómo múltiples variables pueden
referenciar la misma tabla en memoria.
 */
package javaapplication5.pkg2;


public class JavaApplication52 {

    public static void main(String[] args) {
       //Creo tabla de 10 elementos
       int[] origen =new int[10];
               
       //Creo variables que referencien la misma tabla
       int[] ref1= origen;
       int[] ref2= origen;
       int[] ref3= origen;
       
       //Muestro referencias
        System.out.println("Tabla original: "+ origen);
        System.out.println("Referencia 1: "+ ref1);
        System.out.println("Referencia 2: "+ ref2);
        System.out.println("Referencia 3: "+ ref3);
        
        // Compruebo que todas las referencias son iguales
        System.out.println("\nSon la misma referencia?");
        System.out.println("ref1 == origen: " + (ref1 == origen));  
        System.out.println("ref2 == origen: " + (ref2 == origen));  
        System.out.println("ref3 == origen: " + (ref3 == origen));  
    }
    
}
