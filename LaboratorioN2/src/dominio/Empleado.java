/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.time.LocalDate;
import java.time.Period;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author leofl
 */
public class Empleado {
   private String nombre;
    private int año,mes,dia;
    
    public Empleado(){
    this.año = año;
    this.mes = mes;
    this.dia = dia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAño() {
        return año;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }
    
    
    
    public void CalculaEdad(int d,int m, int a,int d1, int m1,int a1,String n){
        
        LocalDate FechaNacimiento = LocalDate.of(a, m, d);
        LocalDate FechaActual = LocalDate.of(a1, m1, d1);
        
 // System.out.println("Primera fecha: " + FechaNacimiento);
 //System.out.println("Fecha actual: " + FechaActual);
        
           System.out.println();
        
        Period periodo = Period.between(FechaNacimiento, FechaActual);
//        System.out.println("años: " + periodo.getYears());
//        System.out.println("meses: " + periodo.getMonths());
//        System.out.println("días: " + periodo.getDays());
        año = periodo.getYears(); 
        mes = periodo.getMonths();
        dia = periodo.getDays();
        nombre = n;
    }
    
    
    
   @Override
   public String toString(){
   return "El nombre del empleado es: "+nombre+  "  La edad es "+año+" años " + mes+" meses  "+dia+" dias";
   }
}
