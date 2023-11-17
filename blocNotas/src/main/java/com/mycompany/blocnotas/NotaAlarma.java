/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.blocnotas;

import java.util.Date;

/**
 *
 * @author sandracano
 */
public class NotaAlarma extends Nota {
    private Date fechaHora;
  

    public NotaAlarma(Date fechaHora, int idNota, String texto) {
        super(idNota, texto);
        this.fechaHora = fechaHora;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void InsertarDatos(){
        
    }
    
    
}
