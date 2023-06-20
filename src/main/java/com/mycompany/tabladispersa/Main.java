/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabladispersa;

import java.util.Scanner;

/**
 *
 * @author Ignacio Gaynor
 */
 class Main {

    public static void main(String[] args) {
        int opcion;
     TablaDispersa tabla = new TablaDispersa();
        Scanner lector = new Scanner(System.in);
        do{
             System.out.println("INGRESE 1 PARA AGREGAR UNA CASA \n INGRESE 2 PARA BUSCAR UNA \n INGRESE 3 PARA ELIMINAR \n INGRESE 4 PARA SALIR "); 
        opcion = lector.nextInt();
     switch(opcion)
     {
         case 1:
             casaRural nuevaCasa = new casaRural();
             nuevaCasa.Muestra();
             TablaDispersa.insertar(nuevaCasa);
             lector.nextLine();
             break;
         case 2:
             lector.nextLine();
             System.out.println("INGRESE EL CODIGO DE LA VIVIENDA");
             String b = lector.nextLine();
             TablaDispersa.buscar(b);
         break;
         case 3:
             lector.nextLine();
             System.out.println("INGRESE EL CODIGO DE LA VIVIENDA QUE DESEA ELIMINAR");
             String C = lector.nextLine();
             TablaDispersa.eliminar(C);
             lector.nextLine();
             break;
             
         
         
         
     }
        }
        while(opcion != 4);
       
     
}
}