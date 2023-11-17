/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blocnotas;

/**
 *
 * @author sandracano
 */
public class NotaTexto extends Nota{
    private String descripcion;

    public NotaTexto(String descripcion, int idNota, String titulo) {
        super(idNota, titulo);
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    public void InsertarDatos(){
        
    }

}
