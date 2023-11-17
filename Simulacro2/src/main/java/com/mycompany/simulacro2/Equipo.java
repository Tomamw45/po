/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulacro2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author jdelr
 */
public class Equipo {
    private String nombre;
    private Double minutos;
    private String pais;
    private Scanner scanner;
    private ArrayList<Ciclista> ciclistas;
    
    public Equipo(){
        this.nombre = "";
        this.minutos = 0.0;
        this.pais = "";
        this.scanner = new Scanner(System.in);
        this.ciclistas = new ArrayList<>();
    }

    public Equipo(String nombre, Double minutos, String pais) {
        this.nombre = nombre;
        this.minutos = minutos;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getMinutos() {
        return minutos;
    }

    public void setMinutos(Double minutos) {
        this.minutos = minutos;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    public Equipo crearEquipo() throws ParseException {
        System.out.println("nombre Equipo:");
        this.nombre = scanner.nextLine();
        System.out.println("minutos:");
        this.minutos = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("pais:");
        this.pais = scanner.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.println("Seleccione el tipo de ciclista:");
            System.out.println("1. Velocista");
            System.out.println("2. Escalador");
            System.out.println("3. Contrarrelojista");
            int tipoCiclista = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea después de nextInt()

            // Crear instancia del tipo de ciclista seleccionado
            Ciclista ciclista = null;
            switch (tipoCiclista) {
                case 1:
                    ciclista = new Velocista().crearCiclista();
                    break;
                case 2:
                    ciclista = new Escalador().crearCiclista();
                    break;
                case 3:
                    ciclista = new Contrarrelojista().crearCiclista();
                    break;
                default:
                    System.out.println("Opción no válida");
            }

            if (ciclista != null) {
                ciclistas.add(ciclista);
            }
        }
        return this;
    }
    public void imprimirTiposCiclistas() {
        for (Ciclista ciclista : ciclistas) {
            ciclista.imprimirTipo();
        }
    }    
}
