/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion2.frecuenciacardiaca;

/**
 *
 * @author osmin
 */
public class FrecuenciaCardiaca {
        private String nombre;
        private String Papellido;
        private String Sapellido;
        private int diaN;
        private int mesN;
        private int yearN;
        
        public void setnombre(String nombre){
            this.nombre = nombre;
        }
        public String getnombre(){
            return nombre;
        }
        public void setPapellido(String Papellido){
            this.Papellido = Papellido;
        }
        public String getPapellido(){
            return Papellido;
        }
        public void setSapellido(String Sapellido){
            this.Sapellido = Sapellido;
        }
        public String getSapellido(){
            return Sapellido;
        }
        public void setdiaN(int diaN){
            this.diaN = diaN;
        }
        public int getdiaN(){
            return diaN;
        }
        public void setmesN(int mesN){
            this.mesN =mesN;
        }
        public int getmesN(){
            return mesN;
        }
        public void setyearN(int yearN){
            this.yearN = yearN;
        }
        public int getyearN(){
            return yearN;
        }
        public String mostrarEdad(){
            String ed = diaN+"/"+mesN+"/"+yearN;
            return ed;
        }
        public int getEdad()
        {
            int Hdia=06;
            int Hmes=06;
            int Hyear=2023;
            
            int calculo1 = 10000*Hyear+100*Hmes+Hdia;
            int calculo2 = 10000*yearN+100*mesN+diaN;
            
            return(int)(calculo1-calculo2)/10000;
        }
        public int getFrecuenciaCardiacaMax(){
            return 200-getEdad();
        }
        public String getFrecuenciaCardiacaEsperada(){
            return String.format("[%.1f - %.1f]",
                    (float) getFrecuenciaCardiacaMax()*0.5,
                    (float) getFrecuenciaCardiacaMax()*0.85);
        }
}
