/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_timestamp;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author eliza
 */
public class Tarea_Timestamp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Timestamp fecha1 = new Timestamp();
        System.out.println("" + fecha1);

        Timestamp fecha5 = new Timestamp();
        fecha5.setAño(2024);
        fecha5.setMes(4);
        fecha5.setDia(25);
        fecha5.setHora(0);
        fecha5.setMinuto(0);
        fecha5.setSegundo(0);
        System.out.println(fecha5);

        Timestamp fecha6 = new Timestamp();
        fecha6.setAño(2024);
        fecha6.setMes(4);
        fecha6.setDia(25);
        fecha6.setHora(12);
        fecha6.setMinuto(9);
        fecha6.setSegundo(1);
        System.out.println(fecha6);

        System.out.println("\n\n\n");

        Timestamp fecha2 = new Timestamp();

        System.out.println("Ingrese el año que desea: ");
        int año = entrada.nextInt();
        fecha2.setAño(año);

        boolean entrada1 = true;
        while (entrada1 == true) {
            System.out.println("Ingrese el mes que desea: ");
            int mes = entrada.nextInt();
            if (mes <= 12 && mes >= 1) {
                fecha2.setMes(mes);
                entrada1 = false;
            } else {
                entrada1 = true;
            }
        }

        Timestamp timestamp = new Timestamp();
        int diasEnElMes = timestamp.DiadeCadaMes(timestamp.getMes(), timestamp.getAño());
        entrada1 = true;

        while (entrada1 == true) {
            System.out.println("Ingrese el día que desea: ");
            int dia = entrada.nextInt();
            if (dia >= 1 && dia <= diasEnElMes || dia >= 1 && dia <= 31) {
                fecha2.setDia(dia);
                entrada1 = false;
            } else {
                entrada1 = true;
            }
        }

        System.out.println("\n");

        System.out.println("" + fecha2);

        System.out.println("\n");
        Timestamp fecha3 = new Timestamp();

        System.out.println("Ingrese el año que desea: ");
        int año2 = entrada.nextInt();
        fecha3.setAño(año2);

        entrada1 = true;

        while (entrada1 == true) {
            System.out.println("Ingrese el mes que desea: ");
            int mes2 = entrada.nextInt();
            if (mes2 >= 1 && mes2 <= 12) {
                fecha3.setMes(mes2);
                entrada1 = false;
            } else {
                System.out.println("Mes inválido");
                entrada1 = true;
            }
        }

        Timestamp timestamp2 = new Timestamp();
        int diasEnElMes2 = timestamp2.DiadeCadaMes(timestamp.getMes(), timestamp.getAño());
        entrada1 = true;

        while (entrada1 == true) {
            System.out.println("Ingrese el día que desea: ");
            int dia2 = entrada.nextInt();
            if (dia2 >= 1 && dia2 <= diasEnElMes2 || dia2 >= 1 && dia2 <= 31) {
                fecha3.setDia(dia2);
                entrada1 = false;
            } else {
                System.out.println("Dia inválido");
                entrada1 = true;
            }
        }

        entrada1 = true;
        while (entrada1 == true) {
            System.out.println("Ingrese la hora que desea: ");
            int hora = entrada.nextInt();
            if (hora >= 0 && hora <= 23) {
                fecha3.setHora(hora);
                entrada1 = false;
            } else {
                System.out.println("hora inválida");
                entrada1 = true;
            }
        }

        entrada1 = true;
        while (entrada1 == true) {
            System.out.println("Ingrese el minuto que desea: ");
            int minuto = entrada.nextInt();
            if (minuto >= 0 && minuto <= 59) {
                fecha3.setMinuto(minuto);
                entrada1 = false;
            } else {
                System.out.println("Minuto inválido");
                entrada1 = true;
            }
        }

        entrada1 = true;
        while (entrada1 == true) {
            System.out.println("Ingrese el segundo que desea: ");
            int segundo = entrada.nextInt();
            if (segundo >= 0 && segundo <= 59) {
                fecha3.setSegundo(segundo);
                entrada1 = false;
            } else {
                System.out.println("Segundo inválido");
                entrada1 = true;
            }
        }

        System.out.println("" + fecha3);

    }
}
