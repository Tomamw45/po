/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.blocnotas;

import java.util.Scanner;

/**
 *
 * @author sandracano
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    
    public static Scanner Entrada;
    
    public static void main(String args[]) {
        
        
        Entrada=new Scanner(System.in);
        BlocNotas bloc=new BlocNotas();
        
        int opcion=0;
        //menu
        System.out.println("1- Insertar Notas");
        System.out.println("2- Eliminar Notas");
        
        System.out.println("Digite la opción");
        opcion=ValidarEntero();
        
        do{
            System.out.println("Digite la opción");
            opcion=ValidarEntero();
             
        }while(opcion==0);
        
       
           switch(opcion){
               case 1-> bloc.InsertarNotas();
               case 2-> bloc.EliminarNotas();
           }
       
        
    }
    
    
    
    public static int ValidarEntero(){

        try{
            String cadena=Entrada.next();
        if(cadena.matches("[0-9]*"))
            return Integer.valueOf(cadena);
        else
           System.out.println("Dato no válido");
        }catch(Exception e){
           System.out.println("Este dato no es válido"); 
        }
        
        
        return 0;
        
    }
}
