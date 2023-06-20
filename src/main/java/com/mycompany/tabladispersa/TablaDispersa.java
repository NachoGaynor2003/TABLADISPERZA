/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tabladispersa;

/**
 *
 * @author Ignacio Gaynor
 */
public class TablaDispersa {

    static final int tamTabla  = 101;
    private static int numElementos;
    private static double factorCarga;
    private static casaRural[] Tabla;

    public TablaDispersa() {

        Tabla = new casaRural[tamTabla];
        for (int i = 0; i < tamTabla; i++) 
            Tabla[i] = null;
            numElementos = 0;
            factorCarga = 0;
    }
            public static int direccion(String Clave){
                int i =0;
                int p;
                long distancia;
                distancia = transformaCadena(Clave);
                p = (int) (distancia % tamTabla);
                while(Tabla[p]!=null && !Tabla[p].elCodigo().equals(Clave)){
                    i++;
                    p= p + i*i;
                    p= p%tamTabla;
                }
                return p;         
            }
            
           public static void insertar(casaRural Beta){
                int posicion = direccion(Beta.elCodigo());
                Tabla[posicion] = Beta;
                numElementos++;
                factorCarga = (double)(numElementos)/tamTabla;
                if(factorCarga > 0.5)
                {
                    System.out.println("EL FACTOR DE CARGA SUPERA EL 50%");
                }
                
                
            }
            
            //FUNCION PARA BUSCAR LA CASA EN ESPECIFICO
            public static casaRural buscar (String Clave)
            {
                casaRural elemento;
                int posicion;
                posicion = direccion(Clave);
                elemento = Tabla[posicion];
                
                if(elemento != null)
                    if(!elemento.esAlta)
                     
                        elemento = null;
                elemento.Muestra();
                 return elemento;
            }
     
            
       //CON ESTA FUNCION, TRANSFORMAMOS UNA CADENA DE CARACTERES AL VALOR DE LA POSICION
        static long transformaCadena(String c){
            long distancia;
            distancia = 0;
            for (int j = 0; j<Math.min(10,c.length()); j++){
                distancia = distancia * 27 + (int) c.charAt(j);
            }
            if(distancia<0){
                distancia = -distancia;}
            return distancia;
        }
        //FUNCION PARA ELIMINAR UNA CASA
        public static void eliminar(String Clave)
        {
            int posicion;
            posicion = direccion(Clave);
            if(Tabla[posicion]!=null){
                Tabla[posicion].esAlta = false; 
            }
        }
}
