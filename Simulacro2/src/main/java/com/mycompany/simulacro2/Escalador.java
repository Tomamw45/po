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
public class Escalador extends Ciclista{
    private float aceleracion;
    private float grado;
    private Scanner scanner;

    public Escalador() {
        super();
        this.aceleracion = 0;
        this.grado = 0;
        this.scanner = new Scanner(System.in);
    }

    public Escalador(int id, String nombre, int minutos,float aceleracion, float grado) {
        super(id, nombre, minutos);
        this.aceleracion = aceleracion;
        this.grado = grado;   
    }

    public float getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(float aceleracion) {
        this.aceleracion = aceleracion;
    }

    public float getGrado() {
        return grado;
    }

    public void setGrado(float grado) {
        this.grado = grado;
    }
    public Ciclista crearCiclista() throws ParseException {
        Escalador nuevo = new Escalador();

        // Escaneo de atributos comunes a todos los ciclistas
        System.out.println("id:");
        nuevo.setId(scanner.nextInt());
        System.out.println("minutos:");
        nuevo.setMinutos(scanner.nextInt());
        scanner.nextLine();
        System.out.println("nombre:");
        nuevo.setNombre(scanner.nextLine());

        // Escaneo de atributos específicos de Escalador
        System.out.println("Aceleracion:");
        nuevo.setAceleracion(scanner.nextFloat());
        System.out.println("Grado:");
        nuevo.setGrado(scanner.nextFloat());

        return nuevo;
    }
    public void imprimirTipo() {
        System.out.println("Es un Escalador");
    }
}
