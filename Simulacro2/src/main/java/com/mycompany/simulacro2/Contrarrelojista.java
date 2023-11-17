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
public class Contrarrelojista extends Ciclista{
    private double Vmaxima;
    private Scanner scanner;

    public Contrarrelojista() {
        super();
        this.Vmaxima = Vmaxima;
        this.scanner = new Scanner(System.in);
    }

    public Contrarrelojista(int id, String nombre, int minutos,double Vmaxima) {
        super(id, nombre, minutos);
        this.Vmaxima = Vmaxima;
    }

    public double getVmaxima() {
        return Vmaxima;
    }

    public void setVmaxima(double Vmaxima) {
        this.Vmaxima = Vmaxima;
    }
    public Ciclista crearCiclista() throws ParseException {
        Contrarrelojista nuevo = new Contrarrelojista();

        // Escaneo de atributos comunes a todos los ciclistas
        System.out.println("id:");
        nuevo.setId(scanner.nextInt());
        System.out.println("minutos:");
        nuevo.setMinutos(scanner.nextInt());
        scanner.nextLine();
        System.out.println("nombre:");
        nuevo.setNombre(scanner.nextLine());

        // Escaneo de atributos específicos de Contrarrelojista
        System.out.println("Vmaxima:");
        nuevo.setVmaxima(scanner.nextDouble());

        return nuevo;
    }
    public void imprimirTipo() {
        System.out.println("Es un Contrarrelojista");
    }
}       
