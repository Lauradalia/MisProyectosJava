/*
 ENCUENTRA DE FORMA MANUAL LA RAIZ CUADRADA DE UN NUMERO MEDIANTE APROXIMACIONES
DE NO SER EXACTA MUESTRA LA RAIZ CUADRADA ANTERIOR Y UN RESTO HASTA EL NUMERO
 */
package javaapplication3.pkg19;
//MPORTANDO CLASES
import java.util.Scanner;

public class JavaApplication319 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //SALIDA CONSOLA PIDE UN NUMERO NATURAL 
        System.out.print("Ingrese un numero natural: ");
        int numero = scanner.nextInt();//LO GUARDA
        //COMPRUEBA QUE EL NUMERO ES POSITIVO
        if (numero < 0) {
           //SALIDA CONSOLA MUESTRA ERROR YA QUE EL NUMERO DEBE SER POSITIVO
            System.out.println("Error: El numero debe ser positivo");
            
        }else{
            //DECLARANDO E INICIALIZANDO LAS VARIABLES
            int raiz = 0;   
            int cuadrado = 0;
             int resto;

            // Buscar la raíz cuadrada por aproximación
            while (cuadrado <= numero) {
                //SI CUADRADO < AL NUMERO QUE ENTRAMOS SIGNIFICA QUE TENEMOS QUE COGER OTRO NUMERO
                raiz++;//INCREMENTAMOS EN 1 EL NUMERO QUE VAMOS A PROBAR
                cuadrado = raiz * raiz;//ELEVAMOS AL CUADRADO DICHO NUMERO PARA COMPARAR CON EL NUMERO ENTRADO
            }

            // Cuando salimos del bucle, nos hemos pasado
            // La raíz correcta es la anterior
            raiz--;//COMO NOS PASAMOS CON EL CUADRADO, RESTAMOS EN 1 AL ULTIMO NUMERO PROBADO DURANTE EL WHILE
            cuadrado = raiz * raiz;//NOS QUEDAMOS CON EL CUADRADO DE DICHO NUMERO
            resto = numero - cuadrado;//HAYAMOS EL RESTO ENTRE EL NUMERO ENTRADO Y EL CUADRADO 

            //SALIDA CONSOLA MUESTRA LA RAIZ  APROXIMADA DEL NUMERO
            System.out.println("Raiz cuadrada de " + numero + " es: " + raiz);
            //SALIDA CONSOLA MUESTRA EL RESTO ENTRE EL NUMERO Y LA RAIZ
            System.out.println("Resto: " + resto);
            //SALIDA CONSOLA MUESTRA LA COMPROBACION DE RAIZ,CUADRADO+RESTO=NUMERO
            System.out.println("Comprobacion: " + raiz + " = " + cuadrado + " + " + resto + " = " + numero);
        }
    }

}
