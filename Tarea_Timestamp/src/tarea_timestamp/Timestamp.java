/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea_timestamp;

/**
 *
 * @author eliza
 */
public class Timestamp {
    int año;
    int mes;
    int dia;
    int hora;
    int minuto;
    int segundo;
    
    public Timestamp(){
        this.año = 0;
        this.mes = 0;
        this.dia = 0;
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    
    public Timestamp(int año, int mes, int dia){
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }
    
    public Timestamp(int año,int mes, int dia, int hora, int minuto, int segundo){
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    public int getAño() {
        return año;
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getHora(){
        return hora;
    }
    
    public int getMinuto(){
        return minuto;
    }
    
    public int getSegundo(){
        return segundo;
    }
    
    public void setAño(int año){
        this.año = año;
    } 
    
    public void setMes(int mes){
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else{
            System.out.println("Mes inválido.");
        }
    }
    
    public void setDia(int dia) {
        if (dia >= 1 && dia <= DiadeCadaMes(this.mes, this.año)) {
            this.dia = dia;
        } else {
            System.out.println("Día inválido.");
        }
    }

    
    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida.");
        }
    }
    
    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else { 
            System.out.println("Minutos inválidos.");
        }
    }
    
    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else { 
            System.out.println("Segundos inválidos");
        }
    }
    
    public int DiadeCadaMes(int mes, int año) {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1; 
        }
    }
    
    @Override
    public String toString() {
        String ceros;
        if (mes < 10) {
            ceros = "0";
        } else {
            ceros = "";
        }

        String ceros2;
        if (dia < 10) {
            ceros2 = "0";
        } else {
            ceros2 = "";
        }

        String ceros3;
        if (hora < 10) {
            ceros3 = "0";
        } else {
            ceros3 = "";
        }

        String ceros4;
        if (minuto < 10) {
            ceros4 = "0";
        } else {
            ceros4 = "";
        }

        String ceros5;
        if (segundo < 10) {
            ceros5 = "0";
        } else {
            ceros5 = "";
        }
        
        return "" + año + "-" + ceros+ mes + "-" + ceros2 + dia + " " + ceros3 + hora + ":" + ceros4 + minuto + ":" + ceros5 + segundo + "";
    }
    
    
}
