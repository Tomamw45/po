/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simulacro2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author jdelr
 */
public class Simulacro2 {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la cantidad de equipos directamente en la consola
        System.out.println("Ingrese la cantidad de equipos:");
        int num = scanner.nextInt();
        
        // Crear la lista de equipos
        ArrayList<Equipo> equipos = new ArrayList<>();
        
        // Crear cada equipo y agregarlo a la lista
        for (int i = 0; i < num; i++) {
            Equipo equipo = new Equipo();
            equipos.add(equipo.crearEquipo());
        }
        
        // Imprimir tipos de ciclistas para cada equipo
        for (Equipo equipo : equipos) {
            equipo.imprimirTiposCiclistas();
        }
    }    
        
        
    }
