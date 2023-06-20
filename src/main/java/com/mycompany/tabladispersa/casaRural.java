/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tabladispersa;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Ignacio Gaynor
 */
public class casaRural {
    private String poblacion, direccion , codigoIdentificatorio;
    private int numHabitacion;
    private double precioXdia;
     boolean esAlta;
         
   public casaRural(){
       esAlta = true;
       asigna();
   }
    public void asigna(){
        Scanner entrada = new Scanner (System.in);
        System.out.println("INGRESE EL CODIGO IDENTIFICATORIO");
        codigoIdentificatorio = entrada.nextLine();
        System.out.println("INGRESE EL NUMERO DE HABITACION");
        numHabitacion = entrada.nextInt();
        System.out.println("INGRESE LA POBLACION");
        poblacion = entrada.nextLine();
        entrada.nextLine();
        System.out.println("INGRESE LA DIRECCION");
        direccion = entrada.nextLine();
        System.out.println("INGRESE EL PRECIO ($)A ABONAR X DIA");
        precioXdia = entrada.nextDouble();
    }
        public String elCodigo(){
            return codigoIdentificatorio;
        }
        public void Muestra(){
            System.out.println("CODIGO IDENTIFICATORIO" + codigoIdentificatorio );
            System.out.println("NUMERO DE HABITACION: " + numHabitacion);
            System.out.println("POBLACION: " + poblacion);
            System.out.println("PRECIO:" + precioXdia);
            System.out.println("DIRECCION" + direccion);
        }
    }

