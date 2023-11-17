/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blocnotas;

/**
 *
 * @author sandracano
 */
public class Nota {
    
    private int idNota;
    private String titulo;

    public Nota(int idNota, String titulo) {
        this.idNota = idNota;
        this.titulo = titulo;
    }

    public int getIdNota() {
        return idNota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void InsertarDatos(){
        
    }

}
