/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blocnotas;

import java.util.ArrayList;

/**
 *
 * @author sandracano
 */
public class BlocNotas {
    
     private ArrayList<NotaTexto>ListaNotasTexto;
     private ArrayList<NotaAlarma>ListaNotasAlarma;
   
     
   public BlocNotas(){
       
   }

    public BlocNotas(ArrayList<NotaTexto> ListaNotasTexto, ArrayList<NotaAlarma> ListaNotasAlarma) {
        this.ListaNotasTexto = ListaNotasTexto;
        this.ListaNotasAlarma = ListaNotasAlarma;
    }

    public ArrayList<NotaTexto> getListaNotasTexto() {
        return ListaNotasTexto;
    }

    public ArrayList<NotaAlarma> getListaNotasAlarma() {
        return ListaNotasAlarma;
    }

    public void setListaNotasTexto(ArrayList<NotaTexto> ListaNotasTexto) {
        this.ListaNotasTexto = ListaNotasTexto;
    }

    public void setListaNotasAlarma(ArrayList<NotaAlarma> ListaNotasAlarma) {
        this.ListaNotasAlarma = ListaNotasAlarma;
    }
     
    public void InsertarNotas(){
        //debe ser implementado similar E2
    }
    
    public void ListarNotas(){
        //debe ser implementado similar E2
    }
    
    public void EliminarNotas(){
      //debe ser implementado similar E2  
    }
    
     
     
   
    
}
