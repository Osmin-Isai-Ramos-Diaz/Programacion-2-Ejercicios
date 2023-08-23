/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion2.pruebafecha;

/**
 *
 * @author osmin
 */
    public class Fecha {
    private int dia;
    private int mes;
    private int year;
    //public Fecha(int dia, int mes, int year){
    public void setDia(int dia){
        this.dia = dia;
    }
    public int getDia(){
        return dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public int getMes(){
        return mes;
    }
    public void setYear(int year){
        this.year =year;
    }
    public int getYear(){
        return year;
    }
   public boolean FechaOk(){
       boolean diaOk, mesOk, yearOk;
       diaOk = dia > 0 && dia <=31;
       mesOk = mes>0 && mes <=12;
       yearOk = year>0;
       return diaOk && mesOk && yearOk;
   }
   }
   
