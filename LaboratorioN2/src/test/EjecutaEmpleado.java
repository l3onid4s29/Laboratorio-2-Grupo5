package test;

import dominio.Empleado;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;
import java.io.*;
import static java.lang.Math.sqrt;

public class EjecutaEmpleado {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Empleado e1 = new Empleado();
        int año = 0,mes = 0,dia =0;
        int año1 =0, mes1 =0 , dia1= 0;
        String nom;
        
        System.out.println("Ingrese el nombre del empleado");
        nom = s.nextLine();
        System.out.println("Ingresa la fecha de nacimiento del empleado  dd/mm/aa ");
        dia = s.nextInt();
        mes = s.nextInt();
        año = s.nextInt();
        System.out.println("Ingresa la fecha actual  dd/mm/aa ");
        dia1 = s.nextInt();
        mes1 = s.nextInt();
        año1 = s.nextInt();
        s.nextLine();
        e1.CalculaEdad(dia, mes, año,dia1,mes1,año1,nom);
        
        //System.out.println(e1.toString());
        String texto = e1.toString();
        String textoleido ="";
        File file = new File("laboratorio2.txt");
        if(!file.exists())
            try{
            file.createNewFile();
                System.out.println(file.getName()+" el archivo ha sido creado");
            }catch(IOException ex){ex.printStackTrace();}
        
            try{
                
            FileWriter fichero = new FileWriter("laboratorio2.txt");
            fichero.write(e1.toString());
            fichero.close();
            }catch(IOException ex){ex.printStackTrace();}
            
            try{
                FileReader leer = new FileReader("laboratorio2.txt");
                BufferedReader BR = new BufferedReader(leer);
                textoleido = BR.readLine();
            }catch(IOException ex){ex.printStackTrace();}
        System.out.println("El mensaje guardado en el texto es: "+textoleido);
        

    }            
    }    

