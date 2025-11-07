/*
Programa que pida un tiempo en horas, minutos y segundos
Luego pida una cantidad de segundos a incrementar
Devuelve la hora resultante
 */
package javaapplication3.pkg13;

import java.util.Scanner;

public class JavaApplication313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //DECLARANDO VARIABLES
        int horas,minutos,segundos,incremento,totalSegundos;
        //Salida consola Pide la cantidad de horas
        System.out.println("Ingrese el numero de horas");
        //Lo guarda
        horas = sc.nextInt();
        //Salida consola Pide la cantudad de minutos
        System.out.println("Ingrese el numero de minutos");
        //Lo guarda
        minutos = sc.nextInt();
        //Salida consola Pide cantidad de segundos
        System.out.println("Ingrese el numero de segundos");
        //Lo guarda
        segundos = sc.nextInt();
        //Salida consola Pide la cantidad de segundos a incrementar
        System.out.println("Ingrese el numero de segundos a incrementar: ");
        //Lo guarda
        incremento = sc.nextInt();

        totalSegundos = horas * 3600 + minutos * 60 + segundos;

        // Sumar el incremento
        totalSegundos += incremento;

        // Calcular la nueva hora
        int nuevasHoras = (totalSegundos / 3600) % 24;
        int resto = totalSegundos % 3600;
        int nuevosMinutos = resto / 60;
        int nuevosSegundos = resto % 60;
        //SALIDA CONSOLA VIEJA HORA
        System.out.printf("Hora original: "+horas+":"+minutos+":"+segundos+"\n");
        //SALIDA CONSOLA NUEVA HORA
        System.out.printf("Hora original: "+nuevasHoras+":"+nuevosMinutos+":"+nuevosSegundos+"\n");

    }
    
}
