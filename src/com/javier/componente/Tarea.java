package com.javier.componente;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Tarea {

    private int horas;
    private int minutos;
    private int segundos;
    private String textoAlarma;
    private Date fecha;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Tarea (int horas, int minutos, int segundos, String textoAlarma, Date fecha){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos=segundos;
        this.textoAlarma=textoAlarma;
        this.fecha=fecha;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String getTextoAlarma() {
        return textoAlarma;
    }

    public void setTextoAlarma(String textoAlarma) {
        this.textoAlarma = textoAlarma;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getSDFDate(){
        return sdf.format(fecha);
    }


}
