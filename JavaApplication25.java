/*
PROGRAMA QUE CALCULA EL DINERO RECAUDADO DE UN CONCIERTO
SI EL AFORO ES MENOR DEL 20% SE CANCELA
SI LAS ENTRADAS NO SUPERAN EL 50% SE APLICA UN 25% DEL DESCUENTO
 */
package javaapplication2.pkg5;
//IMPORTANDO CLASES
import java.util.Scanner;

public class JavaApplication25 {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //SALIDA CONSOLA PIDE AFORO MAXIMO
        System.out.print("Ingrese el aforo máximo del local: ");
        int aforoMax = sc.nextInt();//CREANDO VARIABLE Y GUARDANDO AFORO

        //SALIDA CONSOLA PIDE PRECIO POR ENTRADA
        System.out.print("Ingrese el precio por entrada: ");
        double precioEntrada = sc.nextDouble();//CREANDO VARIABLE Y GUARDANDO PRECIO
        
        //SALIDA CONSOLA PIDE NUMERO DE ENTRADAS VENDIDAS
        System.out.print("Ingrese el número de entradas vendidas: ");
        int entradasVendidas = sc.nextInt();//CREANDO VARIABLE Y GUARDANDO ENTRADAS VENDIDAS
        
        //CALCULANDO AFORO REAL
        double aforoReal = (double) entradasVendidas / aforoMax;
        //SALIDA CONSOLA MUESTRA EL AFORO REAL
        System.out.println("El aforo es: " + aforoReal*100+" %" );
        
        double recaudaTotal = 0;//CREANDO VARIABLE DE RECAUDA TOTAL
        
        //VALORANDO SI EL CONCIERTO SE CANCELA, SI HAY REBAJAS O SI ESTA CONFIRMADO SIN REBAJAS
        if (aforoReal <= 0.20) {//VALORANDO AFORO MENOR DEL 20% CANCELACION
            System.out.println("Entradas insuficientes se cancela el evento");
            System.out.println("Total recaudado: "+recaudaTotal);
        } else if (aforoReal <= 0.50) {//VALORANDO AFORO MENOR DEL 50% REBAJAS
            double precioRebajado = precioEntrada * 0.75;
            recaudaTotal = entradasVendidas * precioRebajado;
            System.out.println("Rebajadas las entradas al 25%");
            System.out.println("Total recaudado: " + recaudaTotal);
        } else {//HAY CONCIERTO SIN REBAJAS
            recaudaTotal = entradasVendidas * precioEntrada;
            System.out.println("Concierto confirmado sin rebajas.");
            System.out.println("Total recaudado: " + recaudaTotal);
        }
    }
}
