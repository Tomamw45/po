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
public class Velocista extends  Ciclista{
    private double potencia;
    private double velocidad;
    private Scanner scanner;

    public Velocista() {
        super();
        this.potencia = 0;
        this.velocidad = 0;
        this.scanner = new Scanner(System.in);
    }

    public Velocista( int id, String nombre, int minutos, double potencia, double velocidad) {
        super(id, nombre, minutos);
        this.potencia = potencia;
        this.velocidad = velocidad;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public Ciclista crearCiclista() throws ParseException {
        Velocista nuevo = new Velocista();

        // Escaneo de atributos comunes a todos los ciclistas
        System.out.println("id:");
        nuevo.setId(scanner.nextInt());
        System.out.println("minutos:");
        nuevo.setMinutos(scanner.nextInt());
        scanner.nextLine();
        System.out.println("nombre:");
        nuevo.setNombre(scanner.nextLine());

        // Escaneo de atributos específicos de Velocista
        System.out.println("Potencia:");
        nuevo.setPotencia(scanner.nextDouble());
        System.out.println("Velocidad:");
        nuevo.setVelocidad(scanner.nextDouble());

        return nuevo;
    }
    public void imprimirTipo() {
        System.out.println("Es un Velocista");
    }
}
