/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulacro2;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author jdelr
 */
public abstract class Ciclista {
    private int id;
    private String nombre;
    private int minutos;
    private Scanner scanner;
    
    public Ciclista()
    {
        this.id = 0;
        this.nombre = "";
        this.minutos = 0;
        this.scanner = new Scanner(System.in);
    }

    public Ciclista(int id, String nombre, int minutos) {
        this.id = id;
        this.nombre = nombre;
        this.minutos = minutos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public abstract Ciclista crearCiclista() throws ParseException;
    public abstract void imprimirTipo();

}
